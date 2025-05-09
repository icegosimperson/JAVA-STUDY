import java.io.*;
import java.util.StringTokenizer;

public class HJ1074 {
    private static int N, r, c, cnt = 0;

    private static void recursive(int size, int startRow, int startCol) {
        if(size == 1) return;
        int currSize = size / 2;
        int blocks = (int)Math.pow(currSize, 2);

        if(r < startRow + currSize && c < startCol + currSize) { //1사분면
            recursive(currSize, startRow, startCol);
        } else if(r < startRow + currSize && c >= startCol + currSize) { //2사분면
            cnt += blocks;
            recursive(currSize, startRow, startCol + currSize);
        } else if(r >= startRow + currSize && c < startCol + currSize) { //3사분면
            cnt += blocks * 2;
            recursive(currSize, startRow + currSize, startCol);
        } else { //4사분면
            cnt += blocks * 3;
            recursive(currSize, startRow + currSize, startCol + currSize);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        int size = (int)Math.pow(2, N);
        recursive(size, 0, 0);

         br.close();
         bw.write(String.valueOf(cnt));
         bw.flush();
         bw.close();
    }
}
