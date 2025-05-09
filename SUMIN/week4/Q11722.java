package SUMIN.week4;

import java.util.*;
import java.io.*;

public class Q11722 {
    public static void main(String[] args) throws IOException {
        //가장 긴 감소하는 부분 수열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int arrLength = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] inputArr = new int[arrLength];

        //주어지는 수를 배열에 담아줌
        int index = 0;
        while (st.hasMoreTokens()) {
            inputArr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        //각 배열에 담긴 숫자 별로 감소하는 길이를 담을 dp 배열 선언
        int[] dp = new int[arrLength];

        //최소 길이가 1이니까 (제일 작은 값이라 더 감소할 수 없는 경우!) 다 1로 채우기
        Arrays.fill(dp, 1);

        //LIS 알고리즘 - 가장 긴 감소하는 부분
        //i가 inputArr[0]부터 순회하면 비교할 값이 없기 때문에 1부터 반복문을 돌려줌
        for (int i = 1; i < arrLength; i++) {
            //j는 i보다 앞에 있는 값들로 반복해서 비교
            for (int j = 0; j < i; j++) {
                //뒤에 있는 값(i)이 앞에 있는 값(j)보다 작다면!! (이 순열은 감소하는 순열)
                //arr[j]를 마지막으로 하는 감소 부분 수열에 arr[i]를 이어붙일 수 있다는 뜻
                if (inputArr[i] < inputArr[j]) {
                    //j(앞에 있는 값)는 적어도 i를 뒤에 가지니 dp[j]에 +1을 한 값을 기준으로 비교
                    //i가 가지는 감소하는 길이와 j의 감소하는 값에 1(i가 더 작으니까)을 더한 값이랑 비교해서
                    //더 큰 값(더 많이 감소하는 만큼)을 i에 갱신해주면 됨..
                    dp[i] = Math.max(dp[i], dp[j]+1);
                    //j까지의 LIS 길이에 i를 추가한 것 -> i까지 연결했을 때의 최장 길이 후보
                }
            }
        }

        //dp 배열에 담긴 값(감소하는 길이)중에 가장 큰 값을 찾아서(가장 긴 감소하는 부분) max 변수에 담기
        int max = 0;
        for (int value : dp) {
            if (value > max) max = value;
        }

        System.out.println(max);

    }

}
