import java.io.*;
import java.util.*;

public class HJ1780 {
    private static int N;
    private static int MINUSONE = 0;
    private static int ZERO = 0;
    private static int ONE = 0;
    private static int[][] grid;

    private static boolean allSame(int startRow, int startCol, int size) {
        int target= grid[startRow][startCol];
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
            if (target == -1) MINUSONE++;
            else if(target == 0) ZERO++;
            else if(target == 1) ONE++;
            return;
        }

        int newSize = size / 3;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                cutPaper(startRow + (i * newSize), startCol + (j * newSize), newSize);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        StringTokenizer st = null;
        for(int row = 0; row < N; row++) {
            st = new StringTokenizer(br.readLine());
            for(int col = 0; col < N; col++) {
                grid[row][col] = Integer.parseInt(st.nextToken());
            }
        }

        cutPaper(0, 0, N);
        sb.append(MINUSONE).append("\n").append(ZERO).append("\n").append(ONE);
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
