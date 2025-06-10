import java.io.*;
import java.util.*;

public class HJ1182 {
    private static int N, S, count = 0;
    static int[] nums;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0, 0);

        //S가 0이면, 아무숫자 없어도 카운트 되니 1 빼주기
        bw.write(String.valueOf(S == 0 ? count - 1 : count));
        bw.flush();
        bw.close();
        br.close();
    }

    private static void dfs(int depth, int sum, int cnt) {
        if(depth == N) {
            if(sum == S && cnt > 0) {
                count++;
            }
            return;
        }
        dfs(depth + 1, nums[depth] + sum, cnt + 1);
        dfs(depth + 1, sum, cnt + 1);
    }

}
