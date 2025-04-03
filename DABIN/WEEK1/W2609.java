package DABIN.WEEK1;

import java.util.Scanner;

public class W2609 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int min = 0;
        if (num1 >= num2)
            min = num2;
        else
            min = num1;
        int td = 0;
        int t1 = 0;
        int t2 = 0;
        int tm = 0;
        for (int i = 1; i <= min; i++) {
            if (((num1 % i) == 0) && ((num2 % i) == 0)) {
                td = i;
                t1 = num1 / i;
                t2 = num2 / i;
            }
        }
        tm = td * t1 * t2;
        System.out.println(td);
        System.out.println(tm);
        sc.close();
    }
}
