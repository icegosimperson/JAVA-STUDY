package SUMIN.week6;

import java.util.*;
import java.io.*;

public class Q17276 {
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        int[][] arr;
        while (testcase-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int degree = Integer.parseInt(st.nextToken());
            int r = degree/45;

            arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int t = 0; t < Math.abs(r); t++) {
                if (r > 0) {
                    arr = clock(arr);
                } else {
                    arr = counterClock(arr);
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j< N; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static int[][] clock(int[][] arr) {
        int[][] ans = copyArray(arr);

        for (int i = 0; i < N; i++) {
            ans[i][N/2] = arr[i][i];
            ans[i][i] = arr[i][N/2];
            ans[N/2][i] = arr[N-i-1][i];
            ans[N-i-1][i] = arr[N-i-1][N/2];
        }
        return ans;
    }
    public static int[][] copyArray(int[][] src) {
        int[][] dst = new int[N][N];
        for (int i = 0; i < N; i++) {
            dst[i] = Arrays.copyOf(src[i], N);
        }
        return dst;
    }

    public static int[][] counterClock(int[][] arr) {
        int[][] ans = copyArray(arr); // 깊은 복사

        for (int i = 0; i < N; i++) {
            ans[i][N/2] = arr[i][N - 1 - i];       // ↙ → 세로
            ans[i][i] = arr[i][N/2];               // 세로 → ↘
            ans[N/2][i] = arr[i][i];               // ↘ → 가로
            ans[N - 1 - i][i] = arr[N/2][i];       // 가로 → ↙
        }
        return ans;
    }

}
