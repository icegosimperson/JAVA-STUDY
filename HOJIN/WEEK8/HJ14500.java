import java.util.*;
import java.io.*;

public class HJ14500 {
    static int N, M;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] fShape = {
            {0, 1, 2},
            {1, 2, 3},
            {2, 3, 0},
            {3, 0, 1}
    };
    static int maxCnt = 0;

    static class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void dfs(Point curr, int cnt, int sum) {
        if(cnt == 3) {
            maxCnt = Math.max(maxCnt, sum);
            return;
        }
        for(int i = 0; i < 4; i++) {
            int newX = curr.x + dx[i];
            int newY = curr.y + dy[i];

            if(inRange(newX, newY) && !visited[newX][newY]) {
                visited[newX][newY] = true;
                sum += grid[newX][newY];
                dfs(new Point(newX, newY), cnt + 1, sum);
                sum -= grid[newX][newY];
                visited[newX][newY] = false;
            }
        }
    }

    static void F_U(int x, int y) { //ㅗ 모양 따로 처리
        for(int[] dirs : fShape) {
            int sum = grid[x][y];
            boolean valid = true;
            for(int dir : dirs) {
                int newX = x + dx[dir];
                int newY = y + dy[dir];

                if(!inRange(newX, newY)) {
                    valid = false;
                    break;
                }
                sum += grid[newX][newY];
            }
            if(valid) {
                maxCnt = Math.max(maxCnt, sum);
            }
        }
    }

    static boolean inRange(int x, int y) {
        return 0 <= x && x < N && 0 <= y && y < M;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        grid = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N ;i++) {
            for(int j = 0; j < M; j++) {
                visited[i][j] = true;
                dfs(new Point(i, j), 0, grid[i][j]);
                visited[i][j] = false;
                //ㅗ모양만 따로 처리
                F_U(i, j);
            }
        }

        bw.write(String.valueOf(maxCnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
