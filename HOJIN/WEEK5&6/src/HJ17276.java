import java.io.*;
import java.util.StringTokenizer;

public class HJ17276 {
    private static StringBuilder sb = new StringBuilder();

    private static void moveGrid(int[][] grid, int degree) {
        int size = grid.length;
        boolean right = true;
        if (degree >= 0) {
            degree /= 45;
        } else {
            degree = Math.abs(degree) / 45;
            right = false;
        }

        for (int round = 0; round < degree; round++) {
            int mid = size / 2;
            int[] pDiag = new int[size];
            int[] sDiag = new int[size];
            int[] midRow = new int[size];
            int[] midCol = new int[size];
            for (int i = 0; i < size; i++) {
                pDiag[i] = grid[i][i]; //주대각선
                sDiag[i] = grid[size - i - 1][i]; //부대각선
                midRow[i] = grid[mid][i]; //가운데행
                midCol[i] = grid[i][mid]; //가운데열
            }

            //이제부터 바꿈
            if (right) {
                for (int i = 0; i < size; i++) {
                    grid[i][mid] = pDiag[i]; //주대각선 이동
                    grid[mid][i] = sDiag[i]; //부대각선 이동
                    grid[i][i] = midRow[i]; //가운데행 이동
                    grid[i][size - i - 1] = midCol[i]; //가운데열 이동
                }
            }
            if(!right) {
                for(int i = 0; i < size; i++) {
                    grid[mid][i] = pDiag[i]; //주대각선 이동
                    grid[i][mid] = sDiag[size - i - 1]; //부대각선 이동
                    grid[size - i - 1][i] = midRow[i]; //가운데행 이동
                    grid[i][i] = midCol[i]; //가운데열 이동
                }
            }
        }
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                sb.append(grid[row][col]).append(" ");
            }
            sb.append("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = null;
        int[][] grid = null;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int degree = Integer.parseInt(st.nextToken());
            grid = new int[size][size];

            //배열 입력
            for (int row = 0; row < size; row++) {
                st = new StringTokenizer(br.readLine());
                for (int col = 0; col < size; col++) {
                    grid[row][col] = Integer.parseInt(st.nextToken());
                }
            }

            moveGrid(grid, degree);
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}