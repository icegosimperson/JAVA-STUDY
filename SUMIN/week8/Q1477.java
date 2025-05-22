package SUMIN.week8;

import java.util.*;
import java.io.*;
public class Q1477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] locate = new int[N+2];
        locate[0] = 0;
        locate[1] = L;
        st = new StringTokenizer(br.readLine());
        for (int i = 2; i < N+2; i++) {
            locate[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(locate);
        int answer = binary_search(locate, M, L);
        System.out.println(answer);
    }

    static int binary_search(int[] arr, int M, int L) {
        int start = 1;
        int end = L - 1;

        while (start <= end) {
            int half = (start + end) / 2;
            int count = 0; //휴게소 개수

            for (int i = 0; i < arr.length - 1; i++) {
                count += (arr[i+1] - arr[i] - 1) / half;
            }

            if (count <= M) {
                end = half - 1;
            } else {
                start = half + 1;
            }
        }
        return start;
    }
}
