import java.io.*;
import java.util.StringTokenizer;
public class HJ1780 {
    private static int N;
    private static int[][] grid;
    private static int papers = 0;

    private static boolean allSame(int startRow, int startCol, int cnt, int target) {
        for(int i = startRow; i < startRow + cnt; i++) {
            for(int j = startCol; j < startCol + cnt; j++) {
                if(target != grid[i][j]) return false;
            }
        }
        return true;
    }

    private static void cutPaper(int cnt) {
        int size = N /= (int) Math.pow(3, cnt);
        if(size < 0) {
            return;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        //배열 입력
        grid = new int[N][N];
        StringTokenizer st = null;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                grid[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }

}
