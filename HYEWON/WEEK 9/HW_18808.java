import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_18808{
    private static int N, M, r, c;
    private static int[][] board;
    private static int[][] sticker= new int[12][12];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 세로
        M = Integer.parseInt(st.nextToken()); // 가로
        int K = Integer.parseInt(st.nextToken()); // 스티커의 개수
        board = new int[N][M];
        int ans = 0;

        while(K-->0){
            st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            for(int i=0; i<r; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<c; j++){
                    sticker[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            for(int ang=0; ang<4; ang++){ // 0~270도 회전하면서 붙일 수 있는지 검사
                boolean isPasted = false;
                for(int x=0; x<=N-r; x++){
                    if(isPasted) break; // 스티커를 붙였다면
                    for(int y=0; y<=M-c; y++){
                        if(simulation(x, y)){ // x, y에 스티커 붙이기
                            isPasted = true;
                            break;
                        }
                    }
                }
                if(isPasted) break;
                rotate();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                ans += board[i][j];
            }
        }
        System.out.println(ans);
    }
    private static boolean simulation(int x, int y){
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(board[x+i][y+j]==1 && sticker[i][j]==1){ // 스티커가 겹치는 경우
                    return false;
                }
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(sticker[i][j]==1){
                    board[x+i][y+j]=1;
                }
            }
        }
        return true;
    }
    private static void rotate(){ // paper을 90도로 회전
        int[][] copySticker = new int[12][12];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                copySticker[i][j]= sticker[i][j];
            }
        }
        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                sticker[i][j] = copySticker[r - 1 - j][i];
            }
        }
        int temp = r;
        r = c;
        c = temp;
    }
}