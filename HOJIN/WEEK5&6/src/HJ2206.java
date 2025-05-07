import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
백트랙킹으로 풀어야하나 고민중 ->
visted[x][y][broken]은 (x,y) 를 그냥(0) / 부수고(1) 방문여부 확인 -> -1이 아직 방문안함
 */
public class HJ2206 {
    private static int N, M;
    private static int[][] grid;
    private static int[][][] visited;
    private static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    static class Node{
        int x, y, broken;

        public Node(int x, int y, int broken) {
            this.x = x;
            this.y = y;
            this.broken = broken;
        }
    }

    private static void bfs() {
        Deque<Node> deque = new ArrayDeque<Node>();
        deque.offerLast(new Node(0, 0, 0));
        visited[0][0][0] = 1;

        while(!deque.isEmpty()) {
            Node curr = deque.pollFirst();
            int x = curr.x;
            int y = curr.y;
            int broken = curr.broken;

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                /*
                1. 벽을 안부쉈고 해당칸 방문 x
                2. 벽을 안부쉈고 해당칸 방문 o
                3. 벽을 부쉈고 해당칸 방문 x
                4. 벽을 부쉈고 해당칸 방문 o
                 */
                if(0 <= nx && nx < N && 0 <= ny && ny < M) {
                    //갈 수 있으면 이전 상태에서 + 1만 시도
                    if(grid[nx][ny] == 0 && visited[nx][ny][broken] == -1) {
                        visited[nx][ny][broken] = visited[x][y][broken] + 1;
                        deque.offerLast(new Node(nx, ny, broken));
                    }
                    //갈 수 없으면 -> 벽을 부순적이 없고 벽을 부순 상태에서 해당칸 방문 이력이 없을때만 부수기
                    if(grid[nx][ny] == 1 && broken == 0 && visited[nx][ny][1] == -1) {
                        visited[nx][ny][1] = visited[x][y][broken] + 1;
                        deque.offerLast(new Node(nx, ny, 1));
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        visited = new int[N][M][2];

        //배열입력
        grid = new int[N][M];
        for(int row = 0; row < N; row++) {
            String currRow = br.readLine();
            for(int col = 0; col < M; col++) {
                grid[row][col] = Character.getNumericValue(currRow.charAt(col));
                visited[row][col][0] = visited[row][col][1] = -1;
            }
        }

        bfs();

        int result = -1;
        if(visited[N - 1][M - 1][0] != -1 && visited[N - 1][M - 1][1] != -1) {
            result = Math.min(visited[N - 1][M - 1][0], visited[N - 1][M - 1][1]);
        } else if(visited[N - 1][M - 1][0] != -1) {
            result = visited[N - 1][M - 1][0];
        } else{
            result = visited[N - 1][M - 1][1];
        }

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
