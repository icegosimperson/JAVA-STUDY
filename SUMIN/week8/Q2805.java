package SUMIN.week8;

import java.util.*;
import java.io.*;
public class Q2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무 개수
        int M = Integer.parseInt(st.nextToken()); // 필요한 나무 높이

        int[] height = new int[N];
        st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(st.nextToken());
            max = Math.max(height[i], max);
        }

        int answer = binary_search(height, M, max);
        System.out.println(answer);

    }

    static int binary_search(int[] arr, int M, int max) {
        int min = 1;
        int half = 0;

        while (min <= max) {
            half = (min + max) / 2;
            long cnt = 0;
            for (int num : arr) {
                if (num - half < 0) {
                    cnt += 0;
                } else {
                    cnt += num - half;
                }
            }

            if (cnt < M) {
                max = half - 1;
            } else {
                min = half + 1;
            }
        }

        return max;
    }
}
