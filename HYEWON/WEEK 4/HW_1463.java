import java.io.*;

// 1로 만드는 연산을 하는 횟수의 최솟값 출력
class HW_1463{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1]; // 1로 만드는 연산을 하는 횟수
        dp[0] = dp[1] = 0;
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + 1; // 1을 빼는 경우는 항상 가능함 -> 기본 연산으로 시작
//            System.out.println("dp["+  i + "] " + dp[i]);
            if(i%2==0){ // 2로 나눠지는 경우
                dp[i] = Math.min(dp[i], dp[i/2]+1); // 2로 나누는게 더 빠를 경우 최솟값 갱신
            }
            if(i%3==0){ // 3으로 나눠지는 경우
                dp[i] = Math.min(dp[i], dp[i/3]+1); // 3으로 나누는게 더 빠를 경우 최솟값 갱신
            }
        }
        bw.write(String.valueOf(dp[N]));

        bw.flush();
        bw.close();
    }
}
