import java.io.*;
import java.util.*;

public class HJ10282_List {
    private static class Edge{
        int node, time;
        public Edge(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    private static String dijkstra(List<List<Edge>> graph, int n, int c) {
        int start = c - 1;
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(new Comparator<Edge>() {
            @Override
            public int compare(Edge e1, Edge e2) {
                return e1.time - e2.time;
            }
        });
        boolean[] visited = new boolean[n];
        int[] connected = new int[n];
        Arrays.fill(connected, Integer.MAX_VALUE);
        connected[start] = 0;

        minHeap.offer(new Edge(start, 0));
        while(!minHeap.isEmpty()){
            Edge curr = minHeap.poll();
            visited[curr.node] = true;

            int currConnected = graph.get(curr.node).size();
            for(int i = 0; i < currConnected; i++) {
                Edge next = graph.get(curr.node).get(i);
                if(visited[next.node]) continue;

                if(connected[next.node] > connected[curr.node] + next.time) {
                    connected[next.node] = connected[curr.node] + next.time;
                    minHeap.offer(new Edge(next.node, connected[curr.node] + next.time));
                }
            }
        }

        int infected = 0;
        int maxTime = 0;
        for(int i = 0; i < n; i++) {
            if(connected[i] != Integer.MAX_VALUE) {
                infected++;
                maxTime = Math.max(maxTime, connected[i]);
            }
        }

        return infected + " " + maxTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;

        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            List<List<Edge>> graph = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }

            while(d-- > 0) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken()) - 1;
                int b = Integer.parseInt(st.nextToken()) - 1;
                int s = Integer.parseInt(st.nextToken());

                graph.get(b).add(new Edge(a, s));
            }

            sb.append(dijkstra(graph, n, c)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}