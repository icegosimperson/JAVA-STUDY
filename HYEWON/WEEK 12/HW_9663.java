import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class HW_9663{
    private static int N;
    private static int[] arr;
    private static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        nQueens(0);
        System.out.println(cnt);
    }
    private static void nQueens(int depth){
        if(depth==N){
            cnt++;
            return;
        }
        for(int i=0; i<N; i++){
            arr[depth]=i;
            if(isValid(depth)){
                nQueens(depth+1);
            }
        }
    }
    private static boolean isValid(int c){
        for(int i=0; i<c; i++){
            if(arr[c]==arr[i]){
                return false;
            }
            else if(Math.abs(c-i)==Math.abs(arr[c]-arr[i])){
                return false;
            }
        }
        return true;
    }
}