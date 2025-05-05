package SUMIN.week4;

import java.util.*;
import java.io.*;

public class Q2579 {

    static int[] score;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairNum = Integer.parseInt(br.readLine());

        score = new int[stairNum+1];

        for (int i = 1; i <= stairNum; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[stairNum+1];
        Arrays.fill(dp, -1);


        System.out.println(DP(stairNum));
    }

    static int DP(int n) {
        if (n == 0) return 0;
        if (n == 1) return score[1];
        if (n == 2) return score[1] + score[2];

        if (dp[n] != -1) return dp[n]; //이미 게산된 경우 계산된 값 리턴

        dp[n] = Math.max(DP(n-2) + score[n], DP(n-3) + score[n-1] + score[n]);

        return dp[n];
    }
}
