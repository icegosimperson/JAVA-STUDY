import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class HJ1520_BFS {
    private static int M, N, routes;
    private static int[][] grid;
    private static int[][] visited;
    private static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    static class Point{
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static boolean inRange(int x, int y) {
        return (0 <= x && x < M && 0 <= y && y < N);
    }

    private static void bfs() {
        Deque<Point> deque = new ArrayDeque<Point>();
        deque.offerLast(new Point(0, 0));
        visited[0][0]++;

        while(!deque.isEmpty()) {
            Point curr = deque.pollFirst();
            int currX = curr.x;
            int currY = curr.y;

            for(int i = 0; i < 4; i++) {
                int newX = currX + dx[i];
                int newY = currY + dy[i];

                if(inRange(newX, newY) && (grid[currX][currY] > grid[newX][newY])) {
                    visited[newX][newY]++;
                    deque.offerLast(new Point(newX, newY));
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        grid = new int[M][N];
        visited = new int[M][N];

        for(int row = 0; row < M; row++) {
            st = new StringTokenizer(br.readLine());
            for(int col = 0; col < N; col++) {
                grid[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        bfs();

        int result = visited[M - 1][N - 1];

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
