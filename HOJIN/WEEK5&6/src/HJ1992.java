import java.io.*;

public class HJ1992 {
    private static int N;
    private static int[][] grid;
    private static StringBuilder sb = new StringBuilder();

    private static boolean allSame(int startRow, int startCol, int size) {
        int target = grid[startRow][startCol];
        for(int i = startRow; i < startRow + size; i++) {
            for(int j = startCol; j < startCol + size; j++) {
                if(target != grid[i][j]) return false;
            }
        }
        return true;
    }

    private static void compress(int startRow, int startCol, int size) {
        if(allSame(startRow, startCol, size)) {
            int target = grid[startRow][startCol];
            if(target == 0) sb.append(0);
            else if(target == 1) sb.append(1);
            return;
        }

        sb.append("(");
        int newSize = size / 2;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                compress(startRow + (i * newSize), startCol + (j * newSize), newSize);
            }
        }
        sb.append(")");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        grid = new int[N][N];
        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for(int j = 0; j < N; j++) {
                grid[i][j] = Character.getNumericValue(line.charAt(j));
            }
        }

        compress(0, 0, N);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
