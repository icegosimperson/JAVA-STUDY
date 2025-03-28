package SUMIN.week1;

import java.util.Scanner;

public class SOO_Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalNum = sc.nextInt();
        int countPrimeNum = 0;
        boolean check;

        for (int j = 0; j < totalNum; j++) {
            int inputNum = sc.nextInt();
            check = IsPrime(inputNum);
            if (check) countPrimeNum++;
        }

        System.out.println(countPrimeNum);

        sc.close();
    }

    public static boolean IsPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
