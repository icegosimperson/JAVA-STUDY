import java.util.*;
import java.io.*;
public class HJ_2606 {
    public static int[][] coms;
    public static boolean[] visited;
    public static int N, T;

    public static void bfs(int start) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(start);
        visited[start] = true;

        while(!deque.isEmpty()) {
            int curr = deque.pollFirst();
            for(int i = 0; i < N; i++) {
                if(coms[curr][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    deque.addLast(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //환경기본세팅
        N = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        coms = new int[N][N]; //컴퓨터수 100이하 -> 100 x 100 = 10,000 배열크기 충분
        visited = new boolean[N];
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            coms[x][y] = 1;
            coms[y][x] = 1;
        }

        bfs(0);
        int sum = -1; //1번 자신은 빼고 집계
        for(int i = 0; i < N; i++) {
            if(visited[i]) sum++;
        }

        br.close();
        bw.write(sb.append(String.valueOf(sum)).toString()); //1번 자신은 빼고 집계
        bw.flush();
        bw.close();
    }
}
