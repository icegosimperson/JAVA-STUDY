package DABIN.WEEK5;

import java.io.*;
import java.util.*;

public class W1780 {
    static int[][] map;
    static int[] count = new int[3]; // count[0] = -1, count[1] = 0, count[2] = 1

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        divide(0, 0, N);

        // 출력: -1, 0, 1 순
        System.out.println(count[0]);
        System.out.println(count[1]);
        System.out.println(count[2]);
    }

    static void divide(int x, int y, int size) {
        if (checkSame(x, y, size)) {
            int val = map[x][y];
            count[val + 1]++; // -1 → 0, 0 → 1, 1 → 2
            return;
        }

        int newSize = size / 3;
        for (int dx = 0; dx < 3; dx++) {
            for (int dy = 0; dy < 3; dy++) {
                divide(x + dx * newSize, y + dy * newSize, newSize);
            }
        }
    }

    static boolean checkSame(int x, int y, int size) {
        int val = map[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != val) return false;
            }
        }
        return true;
    }
}
