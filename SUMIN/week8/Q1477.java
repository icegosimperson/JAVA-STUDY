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

        int[] locate = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            locate[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, locate[i]);
        }
    }

    static int binary_search(int[] arr, int size, int max) {
        int min = 1;
        int half = 0;



        return max;
    }
}
