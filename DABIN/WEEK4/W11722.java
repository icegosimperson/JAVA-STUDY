package DABIN.WEEK4;

import java.util.*;

public class W11722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] narr = new int[n];
        int[] dp = new int[n];

        for (int i = 0; i < n; i++) {
            narr[i] = sc.nextInt();
            dp[i] = 1; // 초기값 설정
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (narr[j] > narr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
        sc.close();
    }
}
