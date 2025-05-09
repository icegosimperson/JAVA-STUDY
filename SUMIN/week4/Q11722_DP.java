package SUMIN.week4;

import java.util.*;
import java.io.*;

public class Q11722_DP {
    static int n;
    static int[] dp; // 감소하는 길이 저장할 배열
    static int[] inputArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        inputArr = new int[n];
        dp = new int[n];
        Arrays.fill(dp, -1); //아직 계산되지 않았을때 -1

        int index = 0;
        while(st.hasMoreTokens()) {
            inputArr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = Math.max(result, DP(i));
        }

        System.out.println(result);
    }

    static int DP(int n) {
        if (dp[n] != -1) return dp[n]; // 이미 계산된 값이 있다면 계산된 값 리턴

        dp[n] = 1; // DP에 들어오는 순간 계산된것(자기 자신이 가장 작더라도 길이는 1이니까 1로 값을 초기화해줌)

        for (int j = 0; j < n; j++) {
            if (inputArr[n] <inputArr[j]) {
                dp[n] = Math.max(dp[n], DP(j)+1);
            }
        }
        return dp[n];
    }
}
