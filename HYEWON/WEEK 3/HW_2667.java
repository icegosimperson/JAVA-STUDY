import java.io.*;
import java.util.*;

class HW_2667{
    static int N;
    static int cnt;
    static int[][] arr;
    static boolean[][] visited;
    static ArrayList<Integer> result = new ArrayList<>();
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static class Node{
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            for(int j=0; j<N; j++){
                arr[i][j] =Integer.parseInt(input.substring(j, j + 1));
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if (arr[i][j]==1 && !visited[i][j]){
                    cnt++;
                    result.add(bfs(i, j));
                }
            }
        }
        // 단지내 집 수를 오름차순 정렬
        Collections.sort(result);
        bw.write(result.size() + "\n");
        for (int num : result) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
    }
    private static int bfs(int s, int e){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(s, e));
        visited[s][e] = true;
        int cnt = 1;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if (isValid(nx, ny)) {
                    if(arr[nx][ny]!=0 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny));
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    private static boolean isValid(int x, int y){
        return 0 <= x && x <N && 0 <=y && y<N;
    }
}