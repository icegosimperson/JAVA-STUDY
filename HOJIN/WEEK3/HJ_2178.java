import java.util.*;
import java.io.*;

public class HJ_2178 {
    static int N, M;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dx = new int[] {-1, 1, 0, 0};
    static int[] dy = new int[] {0, 0, -1, 1};

    static class Coordinate {
        int x, y, path;
        public Coordinate(int x, int y, int path) {
            this.x = x;
            this.y = y;
            this.path = path; //현재까지 이동하는데 걸린 이동횟수
        }
    }

    private static int bfs(Coordinate start) {
        int minPath = 1;
        int startX = start.x;
        int startY = start.y;
        int startPath = start.path;
        visited[startX][startY] = true;
        Deque<Coordinate> deque = new ArrayDeque<>();
        deque.addLast(start);

        while(!deque.isEmpty()) {
            Coordinate curr = deque.pollFirst();
            int currX = curr.x;
            int currY = curr.y;
            int currPath = curr.path;

            for(int i = 0; i < 4; i++) {
                int newX = currX + dx[i];
                int newY = currY + dy[i];

                //조건 -> 1. 격자 안에 들어오고 2. 이동할 수 있고 (1) 3. 이전에 방문한 적 없는지
                if((0 <= newX && newX < N && 0 <= newY && newY < M) && (grid[newX][newY] == 1) &&(!visited[newX][newY])) {
                    if(newX == N - 1 && newY == M - 1) {
                        return currPath + 1;
                    }
                    deque.addLast(new Coordinate(newX, newY, currPath + 1));
                    visited[newX][newY] = true;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=  new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        grid = new int[N][M];
        visited = new boolean[N][M];

        //입력
        for(int i = 0; i < N; i++) {
            String currRow = br.readLine();
            for(int j = 0; j < M; j++) {
                grid[i][j] = currRow.charAt(j) - '0'; //char ->  int
            }
        }

        sb.append(bfs(new Coordinate(0, 0, 1)));
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
