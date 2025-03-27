import java.util.*;
import java.io.*;
public class HJ_2609_Raw {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        //최대공약수
        int smaller = Math.min(a, b);
        int maxDivisor = -1;
        for(int i = 1; i <= smaller; i++) {
            if(a % i == 0 && b % i == 0) maxDivisor = Math.max(maxDivisor, i);
        }

        int minMultiplier = (a / maxDivisor) * (b / maxDivisor) * maxDivisor;

        System.out.println(maxDivisor);
        System.out.println(minMultiplier);
    }
}
