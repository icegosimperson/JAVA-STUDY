package DABIN.WEEK5;

import java.util.Scanner;

public class W2630 {
    static int[][] paper;
    static int white = 0;
    static int blue = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        paper = new int[N][N];

        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                paper[i][j] = sc.nextInt();

        divide(0, 0, N); // (0,0)부터 시작
        System.out.println(white);
        System.out.println(blue);
    }

    static void divide(int x, int y, int size) {
        if (checkSameColor(x, y, size)) {
            if (paper[x][y] == 0) white++;
            else blue++;
            return;
        }

        int half = size / 2;
        divide(x, y, half);                 // 좌상
        divide(x, y + half, half);         // 우상
        divide(x + half, y, half);         // 좌하
        divide(x + half, y + half, half);  // 우하
    }

    static boolean checkSameColor(int x, int y, int size) {
        int color = paper[x][y];
        for (int i = x; i < x + size; i++)
            for (int j = y; j < y + size; j++)
                if (paper[i][j] != color)
                    return false;
        return true;
    }
}
