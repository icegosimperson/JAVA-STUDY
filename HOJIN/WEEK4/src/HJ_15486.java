package src;

import java.util.*;
import java.io.*;
public class HJ_15486 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] schedules = new int[N][2];
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int days = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            schedules[i][0] = days;
            schedules[i][1] = price;
        }

        int[] dp = new int[N + 1];

        for(int i = 0; i < N; i++) {
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            int days = schedules[i][0];
            int price = schedules[i][1];
            int nextDay = i + days;
            if(nextDay <  N + 1) {
                dp[nextDay] = Math.max(dp[nextDay], dp[i] + price);
            }
        }

        int max = -1;
        for(int i = 0; i <= N; i++) {
            max = Math.max(max, dp[i]);
        }
        br.close();
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}
