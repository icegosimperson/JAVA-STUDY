import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1부터 N까지의 수로 이루어진 순열을 사전순으로 출력하는 프로그램 작성
class HW_10974{
    static int N;
    static int[] arr;
    static boolean[] visited;
    private static void permutation(int depth){
        // if 백트래킹 가지치기를 어디까지 할 지 고민 (순열 개수를 따로 구해야하나?)
        // depth
        if(depth==N) {
            for (int i = 0; i <N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=N; i++){
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = i;
                permutation(depth + 1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr= new int[N+1];
        visited = new boolean[N+1];
        permutation(0);
    }
}