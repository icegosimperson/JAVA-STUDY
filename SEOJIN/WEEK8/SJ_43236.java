import java.util.*;
public class SJ_43236 {

    public class Solution {
        public int solution(int distance, int[] rocks, int n) {
            Arrays.sort(rocks);

            int left = 1;
            int right = distance;
            int answer = 0;

            while (left <= right) {
                int mid = (left + right) / 2; // 최소 거리 후보
                int removed = 0;
                int prev = 0;

                for (int i = 0; i < rocks.length; i++) {
                    if (rocks[i] - prev < mid) {
                        removed++; // 최소 거리보다 짧으면 돌 제거
                    } else {
                        prev = rocks[i]; // 다음 기준 돌로 설정
                    }
                }

                // 마지막 도착점까지도 확인
                if (distance - prev < mid) {
                    removed++;
                }

                if (removed > n) {
                    // 너무 많이 제거해야 한다면 → 간격이 너무 큼
                    right = mid - 1;
                } else {
                    // 제거 허용 범위 내 → 더 넓은 간격 도전 가능
                    answer = mid;
                    left = mid + 1;
                }
            }

            return answer;
        }
    }



}
