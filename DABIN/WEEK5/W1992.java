package DABIN.WEEK5;

import java.util.Scanner;

public class W1992 {
    static int[][] video;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        video = new int[N][N];

        for (int i = 0; i < N; i++) {
            String row = sc.next();
            for (int j = 0; j < N; j++) {
                video[i][j] = row.charAt(j) - '0';
            }
        }

        compact(0, 0, N);
        System.out.println(sb);
        sc.close();
    }

    static void compact(int x, int y, int size) {
        if (isSame(x, y, size)) {
            sb.append(video[x][y]);
            return;
        }

        sb.append("(");
        int half = size / 2;
        compact(x, y, half);                 // ↖
        compact(x, y + half, half);          // ↗
        compact(x + half, y, half);          // ↙
        compact(x + half, y + half, half);   // ↘
        sb.append(")");
    }

    static boolean isSame(int x, int y, int size) {
        int value = video[x][y];
        for (int i = x; i < x + size; i++)
            for (int j = y; j < y + size; j++)
                if (video[i][j] != value)
                    return false;
        return true;
    }
}
