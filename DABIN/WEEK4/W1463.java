package DABIN.WEEK4;

import java.util.*;

public class W1463 {
    // public static int dividing(int x) {
    // int count = 10000000;
    // if (x == 1)
    // return 0;
    // if (x % 3 == 0) {
    // count = Math.min(count, 1 + dividing(x / 3));
    // }
    // if (x % 2 == 0) {
    // count = Math.min(count, 1 + dividing(x / 2));
    // }
    // return count = Math.min(count, 1 + dividing(x - 1));

    // }

    // public static int StartDividing(int x, int n) {
    // int rt = 10000000;
    // if (x == 1) {
    // return 0;
    // }
    // switch (n) {

    // case 0:
    // if (x % 3 == 0) {
    // System.out.println("케이스 0 시작합니다");
    // rt = dividing(x / 3);
    // }
    // return rt + 1;

    // case 1:
    // if (x % 2 == 0) {
    // System.out.println("케이스 1 시작합니다");
    // rt = dividing(x / 2);
    // }

    // return rt + 1;

    // case 2:
    // System.out.println("케이스 2 시작합니다");
    // rt = dividing(x - 1);
    // return rt + 1;

    // default:
    // return rt + 1;
    // }
    // }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            dp[1] = 0;
            for (int i = 2; i <= n; i++) {
                dp[i] = dp[i - 1] + 1;
                if (i % 2 == 0)
                    dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                if (i % 3 == 0)
                    dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            
            System.out.println(dp[n]);
        }
    }
}
