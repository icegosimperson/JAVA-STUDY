import java.io.*;
import java.util.*;

public class HJ_1929 {
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        else if(num == 2) return true;
        for(int i = 2; i <= Math.ceil(Math.sqrt(num)); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = N; i <= M; i++) {
            if(isPrime(i)){
                sb.append(i + "\n");
            }
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}
