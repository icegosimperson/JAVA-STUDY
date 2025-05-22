import java.util.*;

public class 징검다리 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        Arrays.sort(rocks);
        int start = 1;
        int end = distance;

        while(start <= end) { //정확한 값을 찾아야 하기 때문에 = 포함
            int mid = (start + end) / 2;
            int cnt = 0;
            int front = 0;

            for(int i = 0; i < rocks.length; i++) {
                if (rocks[i] - front < mid) { //앞에서와의 차이가 최소거리보다 작으면
                    cnt++; // 제거 가능 갯수 증가
                } else {
                    front = rocks[i];
                }
            }

            //2 3 9 11 17 21  -> 2 (1), 3 (2), 9 (3), 11 (4), 17 (4), 21 (5)

            if(distance - front < mid) {
                cnt++;
            }

            if(cnt <= n) { //적당히 지움 -> 범위 늘리기
                start = mid + 1;
                answer = mid;
                // answer = mid;
            } else { //너무 많이 지움 -> 범위 줄이기
                end = mid - 1;
            }
        }


        return answer;
    }
}