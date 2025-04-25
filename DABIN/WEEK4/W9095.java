package DABIN.WEEK4;

import java.util.*;

public class W9095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[n];

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] dp = new int[Math.max(4, m + 1)];
            dp[1] = 1;
            if (m >= 2)
                dp[2] = 2;
            if (m >= 3)
                dp[3] = 4;
            for (int j = 4; j <= m; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];

            }
            count[i] = dp[m];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(count[i]);
        }
        sc.close();

    }
}
