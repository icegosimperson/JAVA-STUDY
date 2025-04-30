package BOSEONG.WEEK6.BOSEONG;

import java.io.*;
import java.util.*;

public class BS_1520{
    public static int M;
    public static int N;
    public static int[][] arr;
    public static int[][] dp; 
    public static int[] dx = {0, 0, 1, -1};
    public static int[] dy = {1, -1, 0, 0}; 

    public static int dfs(int row, int col){
        // 목적지 끝에 도달 하면 1을 리턴해서 밑에서 부터 점점 횟수가 늘어남!
        if(row == M - 1 && col == N - 1){
            return 1;
        }
        if(dp[row][col] != -1) return dp[row][col];
        // 약간 Visited 처럼 방문 했다는 걸 -1 -> 0 으로 표현
        dp[row][col] = 0;

        // 이거 이제 4방향으로 돌아다니면서 범위 벗어나지 않고
        // 값이 작은쪽으로 이동하게 끔
        for(int i = 0; i < 4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];
            if((0 <= nx && nx < M ) && (0 <= ny && ny < N)){
                if(arr[row][col] > arr[nx][ny]){ 
                    dp[row][col] += dfs(nx, ny);
                }
            }
        }
        return dp[row][col];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        arr = new int[M][N];
        dp = new int[M][N];

        // 여기까지 배열 생성
        for(int i = 0; i <  M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j < N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        System.out.println( dfs(0,0));
    }
}