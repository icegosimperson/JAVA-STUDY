package SUMIN.week1;

import java.util.Scanner;

public class SOO_Q2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secNum = sc.nextInt();
        int gcd;

        //최대공약수
        if (firstNum > secNum) {
            gcd = GCD(firstNum, secNum);
            System.out.println(gcd);
        } else {
            gcd = GCD(secNum, firstNum);
            System.out.println(gcd);
        }

        //최소공배수
        //두 자연수 A, B의 최대공약수를 G, 최소공배수를 L이라 하면, A = G × a, B = G × b이므로 최소공배수 L = G × a × b입니다.
        int a = firstNum / gcd;
        int b = secNum / gcd;
        int lcd = a * b * gcd;

        System.out.println(lcd);

        sc.close();
    }

    public static int GCD(int a, int b) {
        if (b == 0) return a;
        else {
            return GCD(b, a%b);
        }
    }
}
