package DABIN.WEEK7;

import java.util.*;
public class W11657 {
    
    static class Edge {
        int start;
        int target;
        int cost;

        Edge(int start, int target, int cost) {
            this.start = start;
            this.target = target;
            this.cost = cost;
        }
    }

    static ArrayList<Edge> graph = new ArrayList<>();
    static final long INF = Long.MAX_VALUE;
    static long[] dist;
    public static boolean bellman_ford(int N, int M, int start) {
        dist =new long[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Edge e = graph.get(j);
                if (dist[e.start] != INF && dist[e.target] > dist[e.start] + e.cost) {
                    dist[e.target] = dist[e.start] + e.cost;
                    if (i == N - 1) {
                        // N번째 라운드에서도 갱신이 되면 음수 사이클 존재
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0;i<M;i++){
            int city = sc.nextInt();
            int bus = sc.nextInt();
            int time = sc.nextInt();
            graph.add(new Edge(city,bus,time));
        }
        int start =1;
        boolean hasNegativeCycle = bellman_ford(N, M, start);
        if(hasNegativeCycle){
            System.out.println(-1);
        }else{
            for (int i = 2; i <= N; i++) {
                if (dist[i] == INF) {
                    System.out.println(-1);
                } else {
                    System.out.println(dist[i]);
                }
            }
        }

        sc.close();
    }
}
