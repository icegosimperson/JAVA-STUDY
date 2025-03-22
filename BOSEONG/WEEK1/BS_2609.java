import java.util.Scanner;

// 소수찾기
class BS_2609{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 여기서 n,m 은 받아놓고 나누면서 바뀔 숫자들
        // a,b는 첫 n,m 값을 받아 최소공배수를 구할 때 사용
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n;
        int b = m;
        if(n < m){
            int temp = n;
            n = m;
            m = temp;
        }
        //유클리드 호제 법 사용할 거임
        while(m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        System.out.println(n);
        System.out.println(a * b / n);
    }
}