package SUMIN.week1;

import java.util.Scanner;

public class SOO_Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNum = sc.nextInt();
        int count = 2;

        while (inputNum >= count) {
            if (inputNum % count == 0) {
                System.out.println(count);
                inputNum /= count;
            } else {
                count++;
            }
        }

        sc.close();
    }
}
