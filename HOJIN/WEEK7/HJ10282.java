import java.util.*;
import java.io.*;

public class HJ10282 {
    private static int T;
    private static int[][] grid;
    private static boolean[] visited;

    static class NextNode {
        int node, time;

        public NextNode(int node, int time) {
            this.node = node;
            this.time = time;
        }
    }

    private static String dijkstra(int n, int d, int c) throws IOException  {
        //걸리는 시간과 감염된 컴퓨터의 수
        visited = new boolean[n];
        int[] connected = new int[n];
        Arrays.fill(connected, Integer.MAX_VALUE);
        connected[c - 1] = 0;

        PriorityQueue<NextNode> minHeap = new PriorityQueue<>(new Comparator<NextNode>() {
            @Override
            public int compare(NextNode n1, NextNode n2) {
                return n1.time - n2.time;
            }
        });
        minHeap.offer(new NextNode(c - 1,0));

        while(!minHeap.isEmpty()) {
            NextNode curr = minHeap.poll();
            if(visited[curr.node]) continue;
            visited[curr.node] = true;

            for(int i = 0; i < n; i++) {
                if(grid[curr.node][i] != -1 && !visited[i]) {
                    if(connected[i] > connected[curr.node] + grid[curr.node][i]) {
                        connected[i] = connected[curr.node] + grid[curr.node][i];
                        minHeap.offer(new NextNode(i, connected[i]));
                    }
                }
            }
        }

        int connectedCnt = 0;
        int maxTime = 0;
        for(int node : connected) {
            if(node != Integer.MAX_VALUE) {
                connectedCnt++;
                maxTime = Math.max(maxTime, node);
            }
        }

        return connectedCnt + " " + maxTime;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            grid = new int[n][n];
            visited = new boolean[n];
            for(int[] a : grid) {
                Arrays.fill(a, -1);
            }
            for(int j = 0; j < n; j++) {
                grid[j][j] = 0;
            }

            //의존성 입력
            for(int j = 0; j < d; j++) {
                st = new StringTokenizer(br.readLine());
                int comA = Integer.parseInt(st.nextToken()) - 1;
                int comB = Integer.parseInt(st.nextToken()) - 1;
                int sec = Integer.parseInt(st.nextToken());

                grid[comB][comA] = sec;
            }
            sb.append(dijkstra(n, d, c)).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
