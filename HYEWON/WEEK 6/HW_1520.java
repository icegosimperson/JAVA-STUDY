import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
항상 높이가 더 낮은 지점으로만 이동하여 목표 지점까지 가고자 한다
항상 내리막길로만 이동하는 경로의 개수를 구하는 프로그램

시간 복잡도 고려 : 500^4 * 500^4 -> 시간 초과
메모이제이션 필요 -> DP
점화식
초기값 세팅

 */
class HW_1520{
    private static int[][] board;
    private static int[][] dp;
    private static int M, N;
    private static int[] dx = {0, 1, 0, -1};
    private static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        board = new int[M][N];
        dp = new int[M][N];

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }
        bw.write(String.valueOf(dfs(0, 0)));
        bw.flush();
        bw.close();
    }
    private static int dfs(int x, int y){
        if(x==M-1 && y==N-1){ // 도착 지점에 도착할 경우
            return 1;
        }

        if(dp[x][y] !=-1) return dp[x][y];

        dp[x][y] = 0; // 초기화 (x, y)부터 도착 지점까지 가는 경우의 수는 0
        for(int k=0; k<4; k++){
            int nx = x + dx[k];
            int ny = y + dy[k];
            if(isValid(nx, ny) && board[x][y] > board[nx][ny]){
                dp[x][y] += dfs(nx, ny);
            }
        }
        return dp[x][y]; // 해당 지점으로부터 도착지점까지 가는 경우의 수
    }
    private static boolean isValid(int nx, int ny){
        return 0<= nx && nx < M && 0 <= ny &&  ny <N;
    }
}