import java.io.*;
import java.util.StringTokenizer;

public class HJ1629 {
    // a ^ n 의 형태
    private static long power(long a, long n, long mod) {
        if(n == 1) {
            return a % mod;
        }

        //modular 합동공식 알고있어야함
        long result = power(a, n / 2, mod);
        if((n % 2) == 1) {
//            return (result * result * a) % mod; //틀림
            return ((result * result % mod) * a % mod) % mod;
        }
        return result * result % mod;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Long A, B, C;
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Long.parseLong(st.nextToken());
        B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());

        br.close();
        bw.write(String.valueOf(power(A, B, C)));
        bw.flush();
        bw.close();
    }
}
