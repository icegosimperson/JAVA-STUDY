import java.util.*;
import java.io.*;

public class HJ_2667 {

    //좌표 클래스 생성
    public static class Coordinate {
        int x, y;
        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int N;
    private static int[][] grid;
    private static boolean[][] visited;

    private static int bfs(Coordinate start) {
        //dx, dy 사용 => 상,하,좌,우 이동
        int[] dx = new int[] {-1, 1, 0, 0};
        int[] dy = new int[] {0, 0, -1, 1};

        Deque<Coordinate> deque = new ArrayDeque<>();
        deque.addLast(start);
        int startX = start.x;
        int startY = start.y;
        visited[startX][startY] = true;
        int connected = 1; //연결된 단지수들 보여줌

        while(!deque.isEmpty()) {
            Coordinate curr = deque.pollFirst();
            int currX = curr.x;
            int currY = curr.y;

            for(int i = 0; i < 4; i++) {
                int newX = currX + dx[i];
                int newY = currY + dy[i];
                if((0 <= newX && newX < N && 0 <= newY && newY < N) && (grid[newX][newY] == 1) && (!visited[newX][newY])) {
                    deque.addLast(new Coordinate(newX, newY));
                    visited[newX][newY] = true;
                    connected += 1;
                }
            }
        }
        return connected;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //연결된 단지들 저장할 List
        ArrayList<Integer> danzis = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String currRow = br.readLine();
            for(int j = 0; j < N; j++) {
                grid[i][j] = currRow.charAt(j) - '0'; // Character를 숫자로 변환
            }
        }

        //좌표별 bfs시도, 방문하지 않았고, 값이 1(집이 있는곳)이면 bfs 시작
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j] && (grid[i][j] == 1)) {
                    int getNums = bfs(new Coordinate(i, j));
                    danzis.add(getNums);
                }
            }
        }

        //단지별 오름차순 정렬
        Collections.sort(danzis, new Comparator<Integer>() {
            public int compare(Integer x, Integer y) {
                return x - y;
            }
        });

        sb.append(danzis.size() + "\n");
        for(int i =0; i < danzis.size(); i++) {
            sb.append(danzis.get(i) + "\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
