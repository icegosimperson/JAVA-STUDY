package DABIN.WEEK4;

import java.util.*;

public class W2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] floor = new int[n + 2];
        for (int i = 0; i < n; i++) {
            floor[i] = sc.nextInt();
        }
        int[] dp = new int[n + 2];
        dp[0] = floor[0];
        dp[1] = floor[0] + floor[1];
        dp[2] = Math.max(floor[0] + floor[2], floor[1] + floor[2]);
        for (int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i - 2] + floor[i], floor[i - 1] + floor[i] + dp[i - 3]);
        }
        System.out.println(dp[n - 1]);

        sc.close();
    }
}
