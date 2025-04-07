package SUMIN.week3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SOO_Q2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int localNum = Integer.parseInt(br.readLine()); // 지방 수

        int[] wishBudget = new int[localNum]; //지방에서 원하는 예산 저장하는 배열
        st = new StringTokenizer(br.readLine());

        int max;
        int min;


        for (int i = 0; i < localNum; i++) {
            wishBudget[i] = Integer.parseInt(st.nextToken());

        }

        Arrays.sort(wishBudget);//으름차순으로 정렬


        int totalBudget = Integer.parseInt(br.readLine()); //국가 전체 예산


    }
}
