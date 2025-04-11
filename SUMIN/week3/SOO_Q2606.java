package SUMIN.week3;

import java.io.IOException;
import java.io.*;
import java.util.*;

public class SOO_Q2606 {
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int infectedCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int m = Integer.parseInt(br.readLine()); // 연결 수

        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 연결 정보 입력 받기
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a); // 양방향 연결
        }

        DFS(1); // 1번 컴퓨터부터 감염 시작

        System.out.println(infectedCount - 1); // 1번 컴퓨터는 제외
    }

    public static void DFS(int current) {
        visited[current] = true;
        infectedCount++;

        for (int next : graph.get(current)) {
            if (!visited[next]) {
                DFS(next);
            }
        }
    }
}
