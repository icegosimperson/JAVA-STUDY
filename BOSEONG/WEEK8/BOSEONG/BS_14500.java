package BOSEONG.WEEK8.BOSEONG;

import java.io.*;
import java.util.*;


public class BS_14500 {
    static int N, M;
    static int[][] arr;
    static boolean[][] visited;
    static int max = 0;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    public static void dfs(int x, int y, int depth, int sum){
        if(depth == 4){
            max = Math.max(sum, max);
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0 <= nx && nx < N && 0 <= ny && ny < M){
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    dfs(nx, ny, depth+1, sum + arr[nx][ny]);
                    visited[nx][ny] = false;
                    if(depth == 2) dfs2(x,y, depth, sum); // 하 진짜 천잰가?
                    // 이 dfs2는 ㅓㅏㅗㅜ 모양을 해결하기 위해서
                    // 깊이가 2면 보내서 딱 2번만 돌게 끔 하기
                }
            }
        }  
    }
    public static void dfs2(int x, int y, int depth, int sum){
        if(depth == 4){
            max = Math.max(sum, max);
            return;
        }

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(0 <= nx && nx < N && 0 <= ny && ny < M){
                if(!visited[nx][ny]){
                    visited[nx][ny] = true;
                    dfs2(x,y, depth + 1, sum + arr[nx][ny]);
                    visited[nx][ny] = false;
                }
            }
        }  
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N][M];
        visited = new boolean[N][M];
    
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j < M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 여기까지 입력값 받고 배열 visited까지 생성
        // 아니 생각해보니까 차피 깊이 4로 두면 어떤 모양이든 나오지 않나?
        for(int k = 0; k < N; k++){
            for(int l = 0; l < M; l++){
                visited[k][l] = true;
                dfs(k,l,1,arr[k][l]);
                visited[k][l] = false;
            }
        }
        System.out.println(max);
    }
}
