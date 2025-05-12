import java.util.*;
import java.io.*;

public class HJ1715_DP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] cards = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            cards[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(cards); //O(n * log(n))

        int[] dp = new int[N + 1];
        if(N == 1) {
            dp[1] = cards[1];
            System.out.println(dp[N]);
            return;
        } else if(N == 2) {
            dp[1] = cards[1];
            dp[2] = cards[2] + dp[1];
            System.out.println(dp[2]);
            return;
        }

        dp[1] = cards[1];
        dp[2] = cards[2] + dp[1];
        for(int i = 3; i <= N; i++) {
            dp[i] = cards[i] + dp[i-1] + dp[i-1];
        }

        br.close();
        bw.write(String.valueOf(dp[N]));
        bw.flush();
        bw.close();
    }
}
