package src;

import java.io.*;

public class HJ_2579 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //계단 수 입력받기 -> 계단 배열 생성
        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        int[] scores = new int[N + 1];
        scores[0] = 0;
        scores[1] = stairs[1];
        if(stairs.length > 2) scores[2] = stairs[1] + stairs[2];

        for(int i = 3; i <= N; i++) {
            scores[i] = Math.max(stairs[i] + scores[i - 2], stairs[i] + stairs[i - 1] + scores[i - 3]);
        }

        br.close();
        bw.write(Integer.toString(scores[N]));
        bw.flush();
        bw.close();
    }
}
