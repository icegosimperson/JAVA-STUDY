import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_1929{
    static int M, N;
    static int[] arr;
    private static void primeNumber(int m, int n){
        arr = new int[n+1];
        for(int i=2; i<=n; i++){
            arr[i] = i; // 배열 초기화
        }
        // 2부터 시작하고 현재 숫자가 지워지지 않을 때는
        // 현재 선택된 숫자의 배수에 해당하는 수를 배열에서 끝까지 탐색하면서 지움
        for(int i=2; i<=Math.sqrt(n); i++){
            if(arr[i]==0) continue; // 이미 지운 변수는 건너뜀
            for(int j=i+i; j<=n; j=j+i){ // 배수 지우기
                arr[j] = 0;
            }
        }
        for(int i=m; i<=n; i++){
            if(arr[i]!=0) {
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        primeNumber(M, N);
    }
}

/*
    private static int isPrime(int m, int n){
        if(m<2){
            return m;
        } else{
            for(int i=m; i<=Math.sqrt(n); i++){
                for(int j=1; j<i; j++){
                    if(i%j==0){
                        break;
                    }
                    System.out.print(j + " ");
                }
            }
        }
        return 0;
    }
 */