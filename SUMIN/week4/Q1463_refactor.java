package SUMIN.week4;

import java.io.*;

public class Q1463_refactor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] dp = new int[num+1];
        dp[1] = 0;
        for (int i = 2; i <= num; i++) {
            dp[i] = dp[i-1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3]+1);
            }
        }
        System.out.println(dp[num]);
    }
}
