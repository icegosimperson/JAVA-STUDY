import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 최단 경로 구하기 -> BFS?
/*
0 : 이동할 수 있는 곳
1 : 벽, 이동할 수 없는 곳
한개 벽을 부수고 이동하는게 좀 더 경로가 짧으면 부셔도됨

3차원 방문 배열을 사용했어야함
visited[x][y][0] : 벽을 부수지 않고 도달, visited[x][y][1] : 벽을 한번 부수고 도달
 */
class HW_2206{
    private static int[][] board;
    private static boolean[][][] visited;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    static int N, M;
    static class Node{
        int x, y;
        int dist; // 시작점부터 거리
        boolean broken; // 벽을 부순지 여부
        Node(int x, int y, int dist, boolean broken){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.broken = broken;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        board = new int[N][M];
        visited = new boolean[N][M][2];

        for(int i=0; i<N; i++){
            String input = br.readLine();
            for(int j=0; j<M; j++){
                board[i][j] = input.charAt(j)-'0';
            }
        }
        System.out.println(Bfs(0, 0)); // N과 M을 입력 받아야하나?
    }
    private static int Bfs(int s, int e){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(s, e, 1, false));
        visited[s][e][0] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            if(cur.x == N-1 && cur.y == M-1){
                return cur.dist;
            }
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny)){
                    if(board[nx][ny]==0){
                        if(!visited[nx][ny][cur.broken ? 1: 0]){
                            visited[nx][ny][cur.broken ? 1: 0] = true;
                            queue.add(new Node(nx, ny, cur.dist+1, cur.broken));
                        }
                    }
                    else if(board[nx][ny]==1 && !cur.broken) { // 벽을 부술 경우
                        if (!visited[nx][ny][1]) {
                            visited[nx][ny][1] = true;
                            queue.add(new Node(nx, ny, cur.dist + 1, true));
                        }
                    }
                }
            }
        }
        return -1; // 도착 못한 경우
    }
    private static boolean isValid(int nx, int ny){
        return 0<= nx && nx <N && 0<=ny && ny <M;
    }
}