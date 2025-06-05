import java.io.*;
import java.util.*;

public class HJ188808 {
    private static int N, M, K;
    private static int[][] grid;

    private static boolean canFill(int startX, int startY, int[][] currGrid) {
        int r = currGrid.length;
        int c = currGrid[0].length;

        if(startX + r > N || startY + c > M) return false;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(currGrid[i][j] == 1 && grid[startX + i][startY + j] == 1) return false;
            }
        }
        return true;
    }

    private static void fill(int startX, int startY, int[][] currGrid) {
        int r = currGrid.length;
        int c = currGrid[0].length;

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(currGrid[i][j] == 1) {
                    grid[startX + i][startY + j] = 1;
                }
            }
        }
    }

    private static int[][] rotate(int[][] currGrid) {
        int r = currGrid.length;
        int c = currGrid[0].length;
        int[][] rotated = new int[c][r];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                rotated[j][r - 1 - i] = currGrid[i][j]; //90도 기준으로 시계방향 전환(코드 연상하기 어려우니까 암기 필요)
            }
        }
        return rotated;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        grid = new int[N][M];
        while(K-- > 0) {
            //현재도형 배열생성
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[][] currGrid = new int[n][m];

            //현재도형 배열입력
            for(int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < m; j++) {
                    currGrid[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            boolean filled = false;
            for(int d = 0; d < 4; d++) {
                for(int x = 0; x <= N - currGrid.length; x++) {
                    for(int y = 0; y <= M - currGrid[0].length; y++) {
                        if(canFill(x, y, currGrid)) {
                            fill(x, y, currGrid);
                            filled = true;
                            break;
                        }
                    }
                    if(filled) break;
                }
                if(filled) break;
                currGrid = rotate(currGrid);
            }
        }

        int total = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(grid[i][j] == 1) total++;
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
        br.close();
    }
}
