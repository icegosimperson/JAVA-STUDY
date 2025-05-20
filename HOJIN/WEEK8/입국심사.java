import java.util.*;

public class 입국심사 {
    public long solution(int n, int[] times) {
        long answer = 0;
        long left = 1;
        long right = (long) times[times.length - 1] * n;

        Arrays.sort(times);

        while(left <= right) {
            long mid = (left + right) / 2;
            long cnt = 0;

            for(int time : times) {
                cnt += mid / time;
            }

            if(cnt < n) { // 제일 느린 심사관도 처리할 수 있는 양을 넘으니까 좀 더 느려도 괜찮다.
                left = mid + 1;

            } else { // 좀 더 빨리 처리해야함
                answer = mid; //answer 그대로 출력하고 싶기 때문에
                right = mid - 1;
            }

        }
        return answer;
    }
}