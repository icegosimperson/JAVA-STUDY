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
        // 예시로 dfs(4,3)가 제일 먼저 왔다고 치자
        // 그러면 dfs(4,3)의 상하좌우로 따지면 4,4를 가게 된다
        // 이때 1을 반환 그럼 아래에서 부터 이동했던 곳들에 대해서 하나씩 더해지게 됨
        // 0,1 ~ 4,3까지는 경로를 지나친 곳에 전부 +=1 이 될 것이다.
        // 그리고 또 다른 경로를 지나가는 곳들도 +=1 이렇게 dp에서 이전에 방문했던 것들을
        // 그대로 이용해서 -1이 아니면 바로 dp를 리턴해서 다음 계산을 더 빠르게 진행하도록 하는 것
         
        // 자 여기 dfs[0][1] 이 왔다
        // dp[0][1]은 -1 이니까 그대로 반환 x 아래로 내려가면서 진행 하면됨
        if(dp[row][col] != -1) return dp[row][col];
        
        // 약간 Visited 처럼 방문 했다는 걸 -1 -> 0 으로 표현
        // dp[0][1] = -1 -> 0 이 되어버림
        dp[row][col] = 0;

				// 또 도는 거임
        // 이거 이제 4방향으로 돌아다니면서 범위 벗어나지 않고
        // 값이 작은쪽으로 이동하게 끔
        for(int i = 0; i < 4; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];
            if((0 <= nx && nx < M ) && (0 <= ny && ny < N)){
            // 여기가 그러면 다음 이동해야하는 좌표의 값이 작으면 이동!
            // 근데 여기는 visited랑 다르게 dp[row][row]의 위치에 대해서 값을 더해주는
            // 방식으로 진행 됨 
            // 예시로 arr[0][0] = 50 > arr[0][1] = 47 이니까 조건에 걸림
            // arr[0][1] > arr[0][2] 니까 또 ~~ 반복하는데
            // 그럼 다시 재귀로 돌아감 dfs[0][0] -> dfs[0][1]  
                if(arr[row][col] > arr[nx][ny]){ 
                // 그렇게 반복해서 마지막엔 결국 dp[0][0] = dp[0][1] + dp[1][0]
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
        System.out.println(dfs(0,0));
    }
}