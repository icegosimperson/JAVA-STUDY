import java.util.*;
import java.io.*;
public class HJ_15649_SB {
    private static int N, M;
    private static int[] result;
    private static boolean[] visited;
    private static StringBuilder sb = new StringBuilder();

    private static void permutation(int cnt) {
        if(cnt == M) {
            for(int num : result) {
                sb.append(num + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            result[cnt] = i;
            permutation(cnt + 1);
            visited[i] = false;
        }
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        visited = new boolean[N + 1];

        permutation(0);

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
