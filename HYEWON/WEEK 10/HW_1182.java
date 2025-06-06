import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_1182{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정수의 개수
        int S = Integer.parseInt(st.nextToken()); // 원소를 다 더한값이 S
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int ans = 0;
        for(int i=1; i< (1<<N); i++){
            sum = 0;
            for(int j=0; j<N; j++){
                if((i&(1<<j)) !=0){
                    sum += arr[j];
                }
            }
            if(sum==S){
                ans++;
            }
        }
        System.out.println(ans);
    }
}