import java.io.*;
import java.util.*;

public class HJ1520_DFS_DP {
    private static int M, N, cnt;
    private static int[][] grid;
    private static int[][] visited;
    private static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    private static boolean inRange(int x, int y) {
        return (0 <= x && x < M && 0 <= y && y < N);
    }

    private static int dfs(int x, int y) {
        if(x == M - 1 && y == N - 1) {
            return 1;
        }

        int currX = x;
        int currY = y;

        if(visited[x][y] != -1) return visited[x][y];
        visited[x][y] = 0;

        for(int i = 0; i < 4; i++) {
            int newX = currX + dx[i];
            int newY = currY + dy[i];
            if(inRange(newX, newY) && grid[currX][currY] > grid[newX][newY]) {
                visited[currX][currY] += dfs(newX, newY);
            }
        }
        return visited[currX][currY];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        grid = new int[M][N];
        visited = new int[M][N];

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
                visited[i][j] = -1;
            }
        }

        br.close();
        bw.write(String.valueOf(dfs(0, 0)));
        bw.flush();
        bw.close();
    }
}
