import java.io.*;

// bottom up : 작은 것부터 쌓아나가는 방식
/*
1. 테이블 정의하기
dp[i] : 2 x n 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수
2. 점화식 찾기
1x2로 채우는 경우
2x1로 채우는 경우
2x2 = 4 -> 2번
2x1 2x1
1x2 1x2

ex) n=9
2x9 = 18

3. 초기값 정하기
*/
class HW_11726{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10_007;
        }
        bw.write(String.valueOf(dp[n]));

        bw.flush();
        bw.close();
    }
}
