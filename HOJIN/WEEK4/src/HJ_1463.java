package src;

import java.io.*;

public class HJ_1463 {
    private static int makeOne(int X) {
        int[] dp = new int[X+1];
        dp[1] = 0;
        for(int i = 2; i <= X; i++) {
            dp[i] = dp[i - 1] + 1;

            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            else if(i % 3 == 0 ) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[X];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int X = Integer.parseInt(br.readLine());

        br.close();
        bw.write(Integer.toString(makeOne(X)));
        bw.flush();
        bw.close();
    }
}
