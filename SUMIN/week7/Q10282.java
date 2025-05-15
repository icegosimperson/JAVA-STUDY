package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q10282 {
    private static class Edge {
        int start;
        int target;
        int time;

        public Edge(int start, int target, int time) {
            this.start = start;
            this.target = target;
            this.time = time;
        }
    }

    static int INF = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        int[] dist;

        for (int i = 0; i < testcase; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); //컴퓨터 개수
            int d = Integer.parseInt(st.nextToken()); //의존성 개수
            int c = Integer.parseInt(st.nextToken()); //해킹당한 컴퓨터 번호

            dist = new int[n+1];
            Arrays.fill(dist, INF);
            dist[c] = 0; //시작점

            List<Edge> edges = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());
                edges.add(new Edge(b, a, time));
            }

            //다익스트라
            for (int k = 0; k < n-1; k++) {
                boolean updated = false;
                for (Edge e : edges) {
                    if (dist[e.start] != INF && dist[e.target] > dist[e.start] + e.time) {
                        dist[e.target] = dist[e.start] + e.time;
                        updated = true;
                    }
                }
                if (!updated) break;
            }

            int computerCnt = 0;
            int max = 0;
            for (int distValue : dist) {
                if (distValue != INF) {
                    computerCnt++;
                    max = Math.max(max, distValue);
                }

            }

            System.out.println(computerCnt + " " + max);
        }
    }
}
