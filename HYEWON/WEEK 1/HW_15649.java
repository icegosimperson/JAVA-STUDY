import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
시간복잡도 :
브루트포스 -> 8중 for문 -> 시간 낭비
중복 없이

 */
class HW_15649{
    static int N, M;
    static boolean[] visited = new boolean[9];
    static int[] arr = new int[9];
    private static void simulation(int k){
        if(k==M){ // M개 다 고를 경우
            for(int i=0; i<M; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=N; i++){ // 1~N까지
            if(!visited[i]){
                arr[k] = i;
                visited[i] = true;
                simulation(k+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        simulation(0);
    }
}


