package BOSEONG.WEEK7.BOSEONG;

import java.io.*;
import java.util.*;

public class BS_15683 {
    static int N;
    static int M;
    static int [][] room;
    static boolean [][] visited; 
    static void dfs(int col, int row){
        switch (room[col][row]) {
            case 1:
                int sum;
                int[] dx = {0,0,1,-1};
                int[] dy = {1,-1,0,0};
                // 아래, 위, 오른, 왼
                for(int i = 0; i < 4; i++){
                    
                }
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        
        // N세로, M가로 
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        room= new int[N][M];
        visited = new boolean[N][M];
        // Cctv는 8개가 넘으면 안된다.. ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ 에잇! 문제 너무 어렵네요
        for (int i = 0; i < N; i++){
            st = new StringTokenizer( br.readLine());
            for(int j = 0; j < M; j++){
                room[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // 일단 여기까지 배열
        // 1번 CCTV는 한 쪽 방향만 감시할 수 있다. 2번과 3번은 두 방향을 감시할 수 있는데, 
        // 2번은 감시하는 방향이 서로 반대방향이어야 하고, <- ->
        // 3번은 직각 방향이어야 한다. <- ^
        // 4번은 세 방향
        // 5번은 네 방향
        // 회전은 항상 90도 방향
        // 지도에서 0은 빈 칸, 6은 벽, 1~5는 CCTV의 번호

        // 일단 dfs 사용 queue에다가 0,0 넣고 시작 하는데 
        // 0이 아니고 방문을 안했다면? 
        // 번호에 따라서 배열을 업데이트 해줘야하는데 얼마나 가릴 수 있느냐
        // 조건 0 && 6 && -1이 아니면 좌표 해당하는거 실행시키기
        // -1은 Cctv가 보는 구역
        for (int i = 0; i< N; i++){
            for(int j = 0; j < M; j++){
                if(room[i][j] != 0 || room[i][j] != 6 || room[i][j] != -1){
                    // 배열 바꿀 함수
                    dfs(i,j);
                }
            }
        }

        // 마지막엔 그냥 for문 돌려서 0이면 answer += 1; 
        int answer =0;
        for(int i =0; i < N; i++){
            for (int j = 0; j < M; j++){
                if(room[i][j] == 0) answer += 1;
            }
        }
        System.out.println(answer);
    }
}
