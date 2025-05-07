import java.io.*;
import java.util.StringTokenizer;

public class HJ1520_DFS_DP {
    private static int M, N;
    private static int[][] grid;
    private static int[][] visited;
    private static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};
    private static boolean inRange(int x, int y) {
        return (0 <= x && x < M && 0 <= y && y < N);
    }

    private static void dfs(int x, int y) {

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



    }

}
