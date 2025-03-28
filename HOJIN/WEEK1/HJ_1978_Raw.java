import java.util.*;
import java.io.*;

public class HJ_1978_Raw {
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        else if(num == 2) return true;

        for(int i = 2; i <= Math.round(Math.sqrt(num)); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(isPrime(num)) answer++;
        }

        System.out.println(answer);
    }
}
