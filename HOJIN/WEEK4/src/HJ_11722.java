package src;

//n * (n - 1) => O(n^2)의 시간복잡도
import java.util.*;
import java.io.*;
public class HJ_11722 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //숫자 갯수 입력
        int N = Integer.parseInt(br.readLine());
        //배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[N];
        for(int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        //i번째 자리까지의 최대감소 갯수 배열
        int[] dp = new int[N];

        int maxCnt = 1;
        for(int i = 0; i < N; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(numbers[j] > numbers[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        for(int num : dp) {
            maxCnt = Math.max(maxCnt, num);
        }

        System.out.println(maxCnt);
    }
}
