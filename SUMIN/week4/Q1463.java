package SUMIN.week4;

import java.util.*;
import java.io.*;

public class Q1463 {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        dp = new int[input+1];
        Arrays.fill(dp, -1);
        System.out.println(calc(input));
    }

    static int calc(int num) {
        if (num == 1) return 0;

        if (dp[num] != -1) return dp[num];

        dp[num] = calc(num-1) + 1;

        if (num% 2 == 0) {
            dp[num] = Math.min(dp[num], calc(num/2) + 1);
        }
        if (num % 3 == 0) {
            dp[num] = Math.min(dp[num], calc(num/3) + 1);
        }

        return dp[num];
    }
}
