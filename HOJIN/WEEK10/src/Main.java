import java.util.*;
import java.io.*;
public class Main {
    private static int N, S, count;
    private static int[] nums;
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        bw.write(S == 0 ? String.valueOf(count - 1) : String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
    private static void dfs(int depth, int sum) {
        if(depth == N) {
            if(sum == S) {
                count++;
            }
            return;
        }

        dfs(depth + 1, sum + nums[depth]);

        dfs(depth + 1, sum);
    }
}