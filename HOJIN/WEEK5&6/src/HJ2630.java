import java.io.*;
import java.util.StringTokenizer;

public class HJ2630 {
    private static int N;
    private static int WHITE = 0;
    private static int BLUE = 0;
    private static int[][] grid;
    private static boolean allSame(int startRow, int startCol, int size) {
        int target = grid[startRow][startCol];
        for(int row = startRow; row < startRow + size; row++) {
            for(int col = startCol; col < startCol + size; col++) {
                if(grid[row][col] != target) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void cutPaper(int startRow, int startCol, int size) {
        if(allSame(startRow, startCol, size)) {
            int target = grid[startRow][startCol];
            if(target == 0) WHITE++;
            else if(target == 1) BLUE++;
            return;
        }
        int newSize = size / 2;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                cutPaper(startRow + (newSize * i), startCol + (newSize * j), newSize);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        StringTokenizer st = null;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, N);
        br.close();
        bw.write(WHITE + "\n" + BLUE);
        bw.flush();
        bw.close();

    }
}
