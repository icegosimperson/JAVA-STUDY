import java.util.*;
class 섬연결하기 {
    public int solution(int n, int[][] costs) {
        int answer = 0;

        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });

        Map<Integer, Integer> group = new HashMap<>();
        for(int i = 0; i < n ;i++) {
            group.put(i, i);
        }

        for(int[] c : costs) {
            int from = c[0];
            int to = c[1];
            int cost = c[2];

            int groupFrom = group.get(from);
            int groupTo = group.get(to);

            if(groupFrom == groupTo) continue; //둘이 같은 부모를 공유하면 skip

            for(int i = 0 ; i < n; i++) {
                int currFrom = i;
                int currTo = group.get(currFrom);
                if(currTo == groupTo) {
                    group.put(currFrom, groupFrom);
                }
            }

            answer += cost;
        }

        return answer;
    }
}