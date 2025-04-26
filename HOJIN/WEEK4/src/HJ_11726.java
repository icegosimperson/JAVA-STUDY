package src;

import java.util.*;
import java.io.*;

public class HJ_11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        //N == 1, 2일때 early return
        if(N == 1) {
            System.out.println(1);
            return;
        }
        if(N == 2) {
            System.out.println(2);
            return;
        }

        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3; i <= N; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }

        br.close();
        bw.write(Integer.toString(dp[N]));
        bw.flush();
        bw.close();
    }
}
