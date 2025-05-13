package SUMIN.week4;

import java.io.*;

public class Q2579_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairNum = Integer.parseInt(br.readLine());

        int[] score = new int[stairNum+1];
        for (int i = 1; i <= stairNum; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }
        int[] dp = new int[stairNum+1];

        dp[0] = 0;
        if (stairNum >= 1) dp[1] = score[1];
        if (stairNum >= 2) dp[2] = score[1] + score[2];

        for (int i = 3; i <= stairNum; i++) {
            dp[i] = Math.max(dp[i-2] + score[i], dp[i-3] + score[i-1] + score[i]);
        }


        System.out.println(dp[stairNum]);
    }
}
