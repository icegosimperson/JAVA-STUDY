package SUMIN.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class SOO_Q11653_OPT {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        // 2로 먼저 나누기
        while (N % 2 == 0) {
            System.out.println(2);
            N /= 2;
        }

        //3부터 sqrt i까지 홀수로만 나누어주기
        for (int i = 3; i <= N; i += 2) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        //N이 1이 아니라면 나머지 남은 최종 값 출력
        if (N > 1) {
            System.out.println(N);
        }

    }
}
