import java.util.*;
import java.io.*;

public class HJ16953 {
    private static int target;

    private static int minCount = Integer.MAX_VALUE;

    private static void dfs(long current, int cnt) {
        if(current > target) return;
        if(current == target) minCount = Math.min(minCount, cnt);

        dfs(current * 2, cnt + 1);
        dfs(current * 10 + 1, cnt + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        target = B;

        dfs(A, 0);

        if(minCount == Integer.MAX_VALUE) minCount = -2;
        bw.write(String.valueOf(minCount + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
