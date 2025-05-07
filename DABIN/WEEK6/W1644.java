package DABIN.WEEK6;

import java.util.Scanner;

public class W1644 {
    static int max = 4000000;
    static int[] pnumber = new int[max + 1];
    static int length = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        InputNumber(max);
        int result = checkNumber(N);
        System.out.println(result);
        sc.close();
    }

    public static void InputNumber(int n) {
        for (int i = 2; i <= max; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }

            }
            if (isPrimeNumber) {
                pnumber[length] = i;
                length++;
            }
        }

    }

    public static int checkNumber(int n) {
        int count = 0;
        if (n == 0 || n == 1) {
            return 0;
        }
        for (int i = 0; i < length; i++) {
            int sum = 0;
            int j = i;
            if (pnumber[j] > n)
                break;
            // System.out.println(LinkPnumber.length);
            while (sum <= n) {
                if (j >= length)
                    break;
                sum += pnumber[j];
                if (sum == n) {
                    count++;

                    sum = 0;
                    // count = 2;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
