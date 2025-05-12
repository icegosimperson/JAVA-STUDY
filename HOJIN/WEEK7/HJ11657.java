import java.io.*;
import java.util.*;

public class HJ11657 {
    private static class Edge {
        int node, time;
        public Edge(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 개수
        int M = Integer.parseInt(st.nextToken()); // 간선 개수

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()) - 1;
            int B = Integer.parseInt(st.nextToken()) - 1;
            int C = Integer.parseInt(st.nextToken());
            graph.get(A).add(new Edge(B, C));
        }

        long[] dist = new long[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0; // 시작점: 0번 도시

        boolean hasCycle = false;

        // 벨만-포드 메인 루프
        for (int i = 0; i < N; i++) {
            for (int u = 0; u < N; u++) {
                for (Edge e : graph.get(u)) {
                    if (dist[u] != Integer.MAX_VALUE && dist[e.node] > dist[u] + e.time) {
                        dist[e.node] = dist[u] + e.time;

                        // 마지막 반복에서 갱신된다면 사이클존재
                        if (i == N - 1) {
                            hasCycle = true;
                        }
                    }
                }
            }
        }

        if (hasCycle) {
            bw.write("-1\n");
        } else {
            for (int i = 1; i < N; i++) {
                bw.write((dist[i] == Integer.MAX_VALUE ? -1 : dist[i]) + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}