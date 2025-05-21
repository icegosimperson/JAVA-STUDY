package DABIN.WEEK7;

import java.util.*;

public class W10282 {
    static class Edge {
        int target, time;
        Edge(int target, int time) {
            this.target = target;
            this.time = time;
        }
    }

    static final int INF = Integer.MAX_VALUE;
    static ArrayList<Edge>[] graph;
    static int[] dist;

    public static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.time));
        pq.add(new Edge(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Edge now = pq.poll();

            if (dist[now.target] < now.time) continue;

            for (Edge next : graph[now.target]) {
                if (dist[next.target] > dist[now.target] + next.time) {
                    dist[next.target] = dist[now.target] + next.time;
                    pq.add(new Edge(next.target, dist[next.target]));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt(); // 컴퓨터 수
            int d = sc.nextInt(); // 의존성 수
            int c = sc.nextInt(); // 해킹 당한 컴퓨터

            graph = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < d; i++) {
                int to = sc.nextInt();
                int from = sc.nextInt();
                int time = sc.nextInt();
                graph[from].add(new Edge(to, time));
            }

            dist = new int[n + 1];
            Arrays.fill(dist, INF);
            dijkstra(c);

            int count = 0, maxTime = 0;
            for (int i = 1; i <= n; i++) {
                if (dist[i] != INF) {
                    count++;
                    maxTime = Math.max(maxTime, dist[i]);
                }
            }
            System.out.println(count + " " + maxTime);
        }

        sc.close();
    }
}
