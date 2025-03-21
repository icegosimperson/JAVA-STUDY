import java.util.*;
import java.io.*;
/*
유클리드 호제법: 2개의 수의 최대공약수를 구하는 알고리즘
O(Log(min(a, b)))
 */

public class HJ_2609_Euclid {
    private static int GCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        return GCD(num2,  num1 % num2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int num1 = Math.max(a, b);
        int num2 = Math.min(a, b);

        int gcd = GCD(num1, num2);
        int lcm = (num1 * num2 ) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
