package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q21278 {
    static long INF = Long.MAX_VALUE / 4; //overflow 방지를 위해 4로 나눔
    static long[][] dist;
    static class Edge {
        int start;
        int target;

        public Edge(int start, int target) {
            this.start = start;
            this.target = target;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 도시
        int M = Integer.parseInt(st.nextToken()); // 간선 개수(도로 개수)

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            edges.add(new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        //거리 담을 배열 초기화
        dist = new long[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0; //시작점이 되는 노드의 값은 0으로 초기화
        }

        //연결된 도시들끼리 거리 1로 초기화
        for (Edge e : edges) {
            dist[e.start][e.target] = 1;
            dist[e.target][e.start] = 1;
        }

        //플로이드-위셜 알고리즘
        for (int k = 1; k <= N; k++) {       // ① k: “경유지”로 허용할 정점
            for (int i = 1; i <= N; i++) {     // ② i: 출발 정점
                for (int j = 1; j <= N; j++) {   // ③ j: 도착 정점
                    long check = dist[i][k] + dist[k][j]; //i -> k -> j : k를 거져처 j로 갈때의 처리
                    if (check < dist[i][j]) {
                        dist[i][j] = check; //거쳐서 가는게 바로 가는것보다 거리가 더 짧다면 업데이트해주기
                    }
                }
            }
        }

        // --- 이미 dist[i][j]에는 모든-정점-쌍 최단거리가 계산된 상태 ---
        long bestSum = Long.MAX_VALUE;
        int bestA = 0, bestB = 0;

        //dist[][]에 담긴애들중에 최단거리인애들을 찾아야만함. . . .
        // 1) 두 치킨집 위치 a, b 선택 (a < b)
        for (int a = 1; a <= N; a++) {
            for (int b = a+1; b <= N; b++) {
                long sum = 0;

                //모든 집 i 에 대해 두 치킨집까지의 최단거리 중 더 작은 쪽을 더함
                for (int i = 1; i <= N; i++) {
                    long da = dist[i][a];
                    long db = dist[i][b];
                    sum += Math.min(da, db);
                }
                //최소합 갱신
                if (sum < bestSum) {
                    bestSum = sum;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        System.out.println(bestA + " " + bestB + " " + 2*bestSum);

    }
}

