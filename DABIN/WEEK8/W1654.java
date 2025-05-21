package DABIN.WEEK8;

import java.util.*;

public class W1654 {
    static int K, N;
    static int[] lan;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        lan = new int[K];
        for (int i = 0; i < K; i++) {
            lan[i] = sc.nextInt();
        }

        long left = 1;
        long right = Arrays.stream(lan).max().getAsInt();
        long answer = 0;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (determine(mid)) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(answer);
        sc.close();
    }

    private static boolean determine(long length) {
        long count = 0;
        for (int l : lan) {
            count += (l / length);
        }
        return count >= N;
    }
}
