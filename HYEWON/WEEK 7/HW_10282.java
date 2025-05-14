import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class HW_10282{
    static class Node{
        int v;
        int cost;
        public Node(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
    }
    private static ArrayList<Node>[] graph;
    private static int[] dist;
    private static boolean[] visited;
    private static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 컴퓨터 개수
            int d = Integer.parseInt(st.nextToken()); // 의존성 개수
            int c = Integer.parseInt(st.nextToken()); // 해킹당한 컴퓨터의 번호

            graph = new ArrayList[n+1];
            dist = new int[n+1];
            visited = new boolean[n+1];
            for(int i=1; i<=n; i++){ // 그래프 초기화
                graph[i] = new ArrayList<>();
                dist[i] = INF;
            }

            for(int i=0; i<d; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int s = Integer.parseInt(st.nextToken());
                graph[b].add(new Node(a, s));
            }
            dijkstra(c);

            int cnt = 0;
            int time = 0;
            for(int i=1; i<=n; i++){
                if(dist[i] != INF){
                    cnt++;
                    time = Math.max(time, dist[i]);
                }
            }
            System.out.println(cnt + " " + time);
        }
    }
    private static void dijkstra(int s){

        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.cost - o2.cost);
        dist[s] = 0; // 시작 위치 거리 0
        pq.offer(new Node(s, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            if (cur.cost > dist[cur.v]) continue;

            for (Node next : graph[cur.v]) {
                if (dist[next.v] > dist[cur.v] + next.cost) {
                    dist[next.v] = dist[cur.v] + next.cost;
                    pq.offer(new Node(next.v, dist[next.v]));
                }
            }
        }
    }
}