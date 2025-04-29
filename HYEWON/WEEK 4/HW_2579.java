import java.io.*;

// bottom up : 작은 것부터 쌓아나가는 방식
/*
1. 테이블 정의하기
dp[i] : i번째 계단엥서 얻을 수 있는 최대 점수
i-1번째 계단을 밟을 경우 : dp[i] = dp[i-3] + dp[i-1] + arr[i] 연속된 3개 계단은 밟아서는 안됨
i-2번째 계단을 밟을 경우 : dp[i] = dp[i-2] + arr[i-2]
2. 점화식 찾기
3. 초기값 정하기
*/
class HW_2579{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 계단의 개수
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(br.readLine()); // 각 계단에 쓰여있는 점수
        }
        dp[1] = arr[1];

        if(2 <= N){
            dp[2] = arr[1] + arr[2];
        }

        for(int i=3; i<=N; i++){  // Math.max 사용해서 점수의 최댓값 갱신하기
            dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
        }

        bw.write(String.valueOf(dp[N]));

        bw.flush();
        bw.close();
    }
}
