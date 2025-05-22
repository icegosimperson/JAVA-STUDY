package SUMIN.week8;
import java.util.*;
public class Q43238_promrammers {
        public long solution(int n, int[] times) {
            Arrays.sort(times);
            long lo = 1;
            long hi = (long) times[times.length-1] * n;
            long half = 0;
            long sum;
            long answer = hi;

            while (lo <= hi) {
                sum = 0;
                half = (lo + hi) / 2;

                for (int time : times) {
                    sum += half / time;
                }

                if (sum >= n) {
                    answer = half;
                    hi = half - 1;
                }
                else {
                    lo = half + 1;
                }
            }
            return answer;
        }
}
