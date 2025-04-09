package SUMIN.week3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SOO_Q1920_OPT {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n =  Integer.parseInt(br.readLine());
        int[] arrA = new int[n]; // 정답을 담을 배열 선언

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrA);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()) { //while을 사용하면 m을 굳이 사용하지 않아도 된다.
            int target = Integer.parseInt(st.nextToken());
            sb.append(Arrays.binarySearch(arrA, target) >= 0 ? 1 : 0).append('\n');
        }
        System.out.println(sb);
    }
}
