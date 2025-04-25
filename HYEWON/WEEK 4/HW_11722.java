import java.io.*;
import java.util.StringTokenizer;

/*
가장 긴 증가하는 부분 수열을 구하는 프로그램
A={10 20 10 30 20 50}
10, 20
 */
class HW_11722{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[N + 1];
        dp[0] = 1; // 초기값 선언
        for(int i=0; i<N; i++){
            dp[i] = 1;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        int LIS = 0;
        for(int i=0; i<N; i++){
            LIS = Math.max(LIS, dp[i]);
        }
        bw.write(String.valueOf(LIS));
        bw.flush();
        bw.close();
    }
}