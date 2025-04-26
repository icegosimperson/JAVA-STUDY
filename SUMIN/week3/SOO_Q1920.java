package SUMIN.week3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SOO_Q1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int ansLength =  Integer.parseInt(br.readLine());
        int[] arrA = new int[ansLength]; // 정답을 담을 배열 선언

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < ansLength; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);

        int inputLength = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < inputLength; j++) {
            int checkNum = Integer.parseInt(st.nextToken());
            if (Arrays.binarySearch(arrA, checkNum) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
