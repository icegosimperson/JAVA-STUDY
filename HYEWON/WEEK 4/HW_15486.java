import java.io.*;
import java.util.StringTokenizer;

class HW_15486{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N+1]; // 걸리는 시간
        int[] P = new int[N+1]; // 상담했을 때 받을 수 있는 비용
        int[] dp = new int[N + 2];


        for(int i=1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }

        // 상담할 수 있는 경우, 상담할 수 없는 경우 나눠짐
        // 상담할 수 있는 경우
        for(int i=N; i>=1; i--){
            if(i+T[i] > N+1) dp[i]=dp[i+1]; // N+1일에는 회사에 없음
            else{
                dp[i] = Math.max(dp[i + 1], P[i] + dp[i + T[i]]);
            }
        }
        bw.write(String.valueOf(dp[1]));
        bw.flush();
        bw.close();
    }
}