import java.util.*;
import java.io.*;

public class HJ_1260 {
    static int N, M, V;
    static boolean[] visited;
    static int[][] grid;
    static StringBuilder sb;

    private static void dfs(int curr) {
        visited[curr] = true;
        sb.append(curr + 1).append(" ");
        for(int i = 0; i < N; i++) {
            if(grid[curr][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int num) {
        visited = new boolean[N]; //visited 배열 초기화
        sb = new StringBuilder(); //StringBuilder 초기화

        Deque<Integer> deque = new ArrayDeque<>();
        int start = num - 1;
        deque.addLast(start);
        visited[start] = true;
        sb.append(start + 1 + " ");

        while(!deque.isEmpty()) {
            int curr = deque.pollFirst();

            for(int i = 0; i < N; i++) {
                if(grid[curr][i] == 1 && !visited[i]) {
                    sb.append(i + 1 + " ");
                    deque.addLast(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        grid = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            grid[a][b] = 1;
            grid[b][a] = 1;
        }
        
        br.close();
        //dfs 호출
        sb = new StringBuilder();
        dfs(V - 1);
        bw.write(sb.toString());
        //dfs bfs 결과 분리
        bw.newLine();
        //bfs 호출
        bfs(V);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
