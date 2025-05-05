package SUMIN.week5;

import java.io.*;
import java.util.*;

public class Q1629 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        System.out.println(remainder(A, B, C));

    }

    public static long remainder(long a, long b, long c) {
        // 지수가 1이면 바로 나머지 구하기.
        if (b == 1) {
            return a % c;
        }
        // 지수가 1 이상이면 지수를 반으로 나누어 다시 나머지 구하기.
        else {

            long halfVal = remainder(a, b / 2, c);
            // 지수가 홀수일 때
            if (b % 2 == 1) {
                return (halfVal * halfVal % c) * a % c;
            }
            // 지수가 짝수일 때
            return halfVal * halfVal % c;
        }
    }

}
