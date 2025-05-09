package DABIN.WEEK4;

import java.io.*;
import java.util.*;

public class W15486 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] day = new int[n];
        int[] money = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            money[i] = Integer.parseInt(st.nextToken());
        }

        // DP 배열 생성 (n+2: n+1일 접근 가능하게)
        int[] dp = new int[n + 2];

        // DP 채우기 (역순으로)
        for (int i = n - 1; i >= 0; i--) {
            int endDay = i + day[i];
            if (endDay <= n) {
                dp[i] = Math.max(money[i] + dp[endDay], dp[i + 1]);
            } else {
                dp[i] = dp[i + 1];  // 상담 불가능하면 다음날 수익 그대로
            }
        }
        /*
            dp[9] = 0 (day=5, money=50, endDay=14)
            dp[8] = 0 (day=4, money=40, endDay=12)
            dp[7] = 30 (day=3, money=30, endDay=10)
            dp[6] = 30 (day=2, money=20, endDay=8)
            dp[5] = 40 (day=1, money=10, endDay=6)
            dp[4] = 40 (day=1, money=10, endDay=5)
            dp[3] = 60 (day=2, money=20, endDay=5)
            dp[2] = 70 (day=3, money=30, endDay=5)
            dp[1] = 80 (day=4, money=40, endDay=5)
            dp[0] = 90 (day=5, money=50, endDay=5)
         */
        bw.write(String.valueOf(dp[0]));
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
    }
}