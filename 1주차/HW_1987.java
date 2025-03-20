import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 소수 : 1과 자기 자신만 약수로 갖는 수
 1은 소수가 될 수 없음
 완탐으로 모든 수로 나눠보기 -> 비효율적
 약수는 항상 두개 씩 쌍을 이룸 -> 제곱근 이하만 확인해도 됨
 시간 복잡도 : O(log N)
 */
class HW_1987{
    private static boolean isPrime(int x){
        if(x==1) return false;
        for(int i=2; i<= Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(isPrime(arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}