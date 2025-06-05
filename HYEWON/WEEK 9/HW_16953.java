import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 어떻게하면 최소 연산값으로 계산할 수 있을까?

class HW_16953{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int cnt = 1;

        while(B>A){
            if(B%2==0){
                B /=2;
            } else if(B%10==1){
                B/=10;
            } else{
                break;
            }
            cnt++;
        }
        System.out.println(B==A ? cnt : -1);
    }
}