import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
1번 도시에서 출발해서 나머지 도시로 가는 가장 빠르시간을 구하는 프로그램 (최단 거리)
시간 C가 양수가 아닌 경우가 있음 -> 음수일 경우 존재 -> 벨만 포드?
 */
class Main{
    static class Edge{
        int u, v, cost;
        public Edge(int u, int v, int cost){
            this.u = u; // 간선 출발 정점
            this.v = v; // 간선 도착 정점
            this.cost = cost; // 가중치
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static int N, M;
    static long[] dist;
    static List<Edge> edges = new ArrayList<>();// 모든 간선을 저장
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 도시의 개수
        M = Integer.parseInt(st.nextToken()); // 다른 도시에 도착하는 버스가 M개

        dist = new long[N + 1]; // 최단 거리 테이블
        Arrays.fill(dist, INF);

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.add(new Edge(s, e, cost));
        }
        if (bellmanFord(1)) {
            System.out.println(-1); // 음수 사이클 존재 시 -1 출력
        }
        else{
            for(int i=2; i<N+1; i++){
                if(dist[i]==INF){ // 도달할 수 없을 경우 -1 출력
                    System.out.println(-1);
                }
                else{ // 최단 거리 출력
                    System.out.println(dist[i]);
                }
            }
        }
    }
    private static boolean bellmanFord(int start) {
        dist[start] = 0; // 출발지는 0으로 초기화

        for (int i = 1; i <= N; i++) {
            for (Edge edge : edges) {
                int u = edge.u;
                int v = edge.v;
                int cost = edge.cost;

                if (dist[u] != INF && cost + dist[u] < dist[v]) { // u를 거쳐가는 거리가 짧을 경우
                    dist[v] = dist[u] + cost; // v까지 가는 최단 거리 갱신

                    if (i == N) { // 음수 사이클 존재
                        return true;
                    }
                }
            }
        }
        return false;
    }
}