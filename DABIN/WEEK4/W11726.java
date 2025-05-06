package DABIN.WEEK4;

import java.util.*;

public class W11726 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] dp = new int[n + 2];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 3;
            
            for (int i = 4; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            System.out.println(dp[n]);
        }

    }
}
