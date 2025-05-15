package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q11657 {
    static final long INF = Long.MAX_VALUE;
    static long[] dist;

    static class Edge {
        int start;
        int target;
        long cost;

        public Edge(int start, int target, long cost) {
            this.start = start;
            this.target = target;
            this.cost = cost;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        dist = new long[N+1];
        Arrays.fill(dist, INF);
        dist[1] = 0; // 1번 노드에서 출발(1번 노드 값 0으로 바꿔주기)

        ArrayList<Edge> edges = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            edges.add(new Edge(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        //벨만-포드 알고리즘
        for (int i = 0; i < N-1; i++) {
            boolean updated = false;
            for (Edge e : edges) {
                if (dist[e.start] != INF && dist[e.target] > dist[e.start] + e.cost) {
                    dist[e.target] = dist[e.start] + e.cost;
                    updated = true;
                }
            }
            //더이상 업데이트 없으면 종료
            if (!updated) break;
        }

        //음수 간선인지 확인
        for (Edge e : edges) {
            if (dist[e.start] != INF && dist[e.target] > dist[e.start] + e.cost) {
                //음수간선이면 첫쨰줄에 -1 출력하고 종료
                System.out.print(-1);
                return;
            }
        }

       for (int i = 2; i <= N; i++) {
           //1에서 갈 수 없는 노드라면 -1 출력
           if (dist[i] == INF) System.out.println(-1);
           else {
               //그 외에는 dist[i]출력
               System.out.println(dist[i]);
           }
       }




    }
}
