import java.util.*;
import java.io.*;


public class HJ_15649 {
    private static int N;
    private static int M;
    private static int[] result;
    private static boolean[] visited;

    private static void permutation(int cnt) {
        if(cnt == M) {
            for(int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[cnt] = i;
                permutation(cnt + 1);
                visited[i] = false;
            }
//            if(visited[i]) continue;
//            visited[i] = true;
//            result[cnt] = i;
//            permutation(cnt + 1);
//            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M];
        visited = new boolean[N + 1];
        visited[0] = true;

        permutation(0);
    }
}
