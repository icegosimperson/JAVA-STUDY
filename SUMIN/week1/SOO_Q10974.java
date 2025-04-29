package SUMIN.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SOO_Q10974 {
    public static int[] arr;
    public static boolean[] isVisit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        arr = new int[N];
        isVisit = new boolean[N];
        dfs(N, 0);
        System.out.println(sb);


    }

    public static void dfs(int N, int depth) {
        if (depth == N) {
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!isVisit[i]) {
                isVisit[i] = true;
                arr[depth] = i+1;
                dfs(N, depth+1);
                isVisit[i] = false;

            }
        }
    }
}
