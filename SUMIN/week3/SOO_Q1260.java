package SUMIN.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SOO_Q1260 {
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점 수
        int m = Integer.parseInt(st.nextToken()); // 간선 수
        int start = Integer.parseInt(st.nextToken()); // 시작 정점

        graph = new int[n + 1][n + 1]; // 1번 정점부터 쓰기 위해 n+1 크기로
        visited = new boolean[n + 1];

        // 간선 입력
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1; // 양방향 연결
        }

        // DFS
        DFS(start);
        sb.append('\n');

        // visited 배열 초기화 후 BFS
        Arrays.fill(visited, false);
        BFS(start);

        System.out.println(sb);
    }
    public static void DFS(int v) {
        visited[v] = true;
        sb.append(v).append(' ');

        for (int i = 1; i < graph.length; i++) {
            if (!visited[i] && graph[v][i] == 1) {
                DFS(i);
            }
        }
    }

    public static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();
            sb.append(cur).append(' ');

            for (int i = 1; i < graph.length; i++) {
                if (!visited[i] && graph[cur][i] == 1) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }


}
