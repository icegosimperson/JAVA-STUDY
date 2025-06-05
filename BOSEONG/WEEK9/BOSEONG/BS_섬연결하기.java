package BOSEONG.WEEK9.BOSEONG;

import java.util.*;
public class BS_섬연결하기 {


class Solution {
    public int solution(int n, int[][] costs) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        // 그래프 만들 때 비용도 추가로 넣어주기
        for (int[] c : costs) {
            graph[c[0]].add(new int[]{c[1], c[2]});
            graph[c[1]].add(new int[]{c[0], c[2]});
        }

        boolean[] visited = new boolean[n];
        // 우선 순위 써서 비용 순서대로 나열하도록 하기
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0}); // {정점, 비용}

        int total = 0;
        int count = 0;

        // 비어있거나 다리 놓는 갯수 넘어가면 멈추게 하고
        while (!pq.isEmpty() && count < n) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            // 이미 값 있으면 넘어가도록 함
            // 차피 우선순위 큐 써서 작은 수 먼저나오기 때문에
            if (visited[node]) continue;

            // 그게 아니면 값 더해주기
            visited[node] = true;
            total += cost;
            count++;

            for (int[] next : graph[node]) {
                if (!visited[next[0]]) {
                    pq.offer(next);
                }
            }
        }

        return total;
    }
}
}
