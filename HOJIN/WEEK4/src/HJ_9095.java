package src;

import java.io.*;

public class HJ_9095 {

    private static int getCnt(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        if(n > 1) dp[2] = 2;
        if(n > 2) dp[3] = 4;
        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 3] +  + dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            System.out.println(getCnt(Integer.parseInt(br.readLine())));
        }
    }
}
