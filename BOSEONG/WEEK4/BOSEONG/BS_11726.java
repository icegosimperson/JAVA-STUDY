import java.util.*;

public class BS_11726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2 x n의 사각형 채우기
        // 1 x 2, 2 x 1이 있음
        int n = sc.nextInt();
        int [] dp = new int[n+1];
        // dp 풀때 항상 느끼는 건데
        // 무조건 정해지는 초기 값들을 가지고 풀어야함
        // 만약에 2x1 면
        dp[1] = 1;
        //2면 세로 2개 세로 2개, 2가지 
        dp[2] = 2;        
        //3이면 세로 3개, 세로 1개 가로 2개, 가로 2개 세로 1개
        // dp[3] = dp[1] + dp[2]
        for(int i = 3; i <= n; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 10007;
        }
        // 그리고 방법의 수를 구하면 10007로 나눠야함
        System.out.println(dp[n]);
    }
}
