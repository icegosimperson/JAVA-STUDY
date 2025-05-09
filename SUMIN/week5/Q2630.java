package SUMIN.week5;

import java.io.*;
import java.util.*;

public class Q2630 {
    static int[][] paper;
    //blue == 1, white == 0
    static int[] count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        count = new int[2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        division(0,0,N);
        System.out.println(count[0]);
        System.out.println(count[1]);
    }

    public static void division(int x, int y, int N) {
        if (check(x, y, N)) {
            if (paper[x][y] == 0) {
                count[0]++;
            } else {
                count[1]++;
            }
            return;
        }

        int size = N / 2;

        //왼쪽 위
        division(x, y, size);
        //오른쪽 위
        division(x+size, y, size);
        //왼쪽 아래
        division(x, y+size, size);
        //오른쪽 아래
        division(x+size, y+size, size);
    }

    public static boolean check(int x, int y, int N) {
        if (N == 1) return true;

        int firstNum = paper[x][y];
        for (int i = x; i < x+N; i++) {
            for (int j = y; j <y+N; j++) {
                if (paper[i][j] != firstNum) {
                    return false;
                }
            }
        }

        return true;
    }
}
