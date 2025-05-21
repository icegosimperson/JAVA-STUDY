package DABIN.WEEK7;

import java.util.*;

public class W21278 {
    static final int INF = 1000000;
    static int[][] dist;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 건물 수
        M = sc.nextInt(); // 길 수

        dist = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            dist[a][b] = 1;
            dist[b][a] = 1;
        }

        for (int k = 1; k <= N; k++) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        int minSum = Integer.MAX_VALUE;
        int ansA = -1, ansB = -1;

        // 치킨집 두 개 고르기
        for (int i = 1; i <= N; i++) {
            for (int j = i + 1; j <= N; j++) {
                int sum = 0;
                for (int k = 1; k <= N; k++) {
                    int d = Math.min(dist[k][i], dist[k][j]);
                    sum += d * 2; // 왕복 거리
                }

                if (sum < minSum) {
                    minSum = sum;
                    ansA = i;
                    ansB = j;
                }
            }
        }

        System.out.println(ansA + " " + ansB + " " + minSum);
        sc.close();
    }
}
