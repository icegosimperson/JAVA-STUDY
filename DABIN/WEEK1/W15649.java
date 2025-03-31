package DABIN.WEEK1;

import java.util.Scanner;

public class W15649 {
    void permutation(int[] arr, int depth, int N, int M, boolean[] visited, int[] out) {
        if (depth == M) {
            for (int i = 0; i < M; i++) {
                System.out.print(out[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, N, M, visited, out);
                visited[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numArr = new int[N];
        boolean[] visited = new boolean[N];
        int[] out = new int[M];
        for (int i = 0; i < N; i++) {
            numArr[i] = i + 1;
        }
        W15649 m = new W15649();
        m.permutation(numArr, 0, N, M, visited, out);

        sc.close();
    }
}
