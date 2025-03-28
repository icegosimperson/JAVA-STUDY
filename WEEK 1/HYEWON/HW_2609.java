import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
최대 공약수(gcd)
최소 공배수(lcm)
시간 복잡도 : 유클리드 호제법 사용 시 O(log N)
유클리드 호제법? MOD 연산의 반복
 */
class HW_2609 {
    private static int gcd(int a, int b){
        if(b==0) return a;
        else return gcd(b, a%b);
    }
    private static int lcm(int a, int b){
        return (a*b) / gcd(a, b);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}