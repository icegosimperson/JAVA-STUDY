package DABIN.WEEK1;

import java.util.Arrays;
import java.util.Scanner;

public class W1978 {
    public static int check(int last) {
        int ln = 0;
        for (int j = 1; j < last; j++) {
            if ((j * j) > last)
                ln = j;
        }
        return ln;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int dec = 0;
        int[] numArr = new int[n];
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }
        int[] disArr = Arrays.stream(numArr).distinct().toArray();
        int max = Arrays.stream(disArr).max().getAsInt();
        int last = check(max);
        int len = disArr.length;
        for (int k = 0; k < len; k++) {
            if (disArr[k] == 1)
                continue;
            for (int l = 2; l < last; l++) {
                if ((disArr[k] % l) == 0 && (disArr[k] != l))
                    count++;
            }
            if (count == 0)
                dec++;
            count = 0;
        }
        System.out.println(dec);
        sc.close();
    }
}
