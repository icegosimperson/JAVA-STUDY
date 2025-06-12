import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class HW_17779{
    private static int[][] A;
    private static int total=0;
    private static int N;
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        A = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                A[i][j] = Integer.parseInt(st.nextToken());
                total += A[i][j];
            }
        }

        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                for(int d1=1; d1<N; d1++){
                    for(int d2=1; d2<N; d2++){
                        if(N <= x+d1+d2) continue;
                        if(y-d1 <0 || N <= y+d2) continue;
                        simulation(x, y, d1, d2);
                    }
                }
            }
        }
        System.out.println(min);
    }
    private static void simulation(int x, int y, int d1, int d2){
        boolean[][] board = new boolean[N][N];

        // 경계선
        for(int i=0; i<=d1; i++){
            board[x + i][y - i] = true;
            board[x + d2 + i][y + d2 - i] = true;
        }

        for(int i=0; i<=d2; i++){
            board[x+i][y+i] = true;
            board[x+d1+i][y-d1+i] = true;
        }
        int[] sum = new int[5];

        for(int i=0; i<x+d1; i++) { // 1구역
            for(int j=0; j<=y; j++){
                if(board[i][j]) break;
                sum[0] += A[i][j];
            }
        }

        for(int i=0; i<=x+d2; i++){
            for(int j=N-1; j>y; j--){
                if(board[i][j]) break;
                sum[1] += A[i][j];
            }
        }
        for(int i=x+d1; i<N; i++){
            for(int j=0; j<y-d1+d2; j++){
                if(board[i][j]) break;
                sum[2] += A[i][j];
            }
        }
        for(int i=x+d2+1; i<N; i++){
            for(int j=N-1; y-d1+d2<=j; j--){
                if(board[i][j]) break;
                sum[3] += A[i][j];
            }
        }

        sum[4] = total; // 5구역
        for(int i=0; i<4; i++){
            sum[4] -= sum[i];
        }
        Arrays.sort(sum);

        min = Math.min(min, sum[4] - sum[0]);
    }
}