package DABIN.WEEK1;

import java.util.*;

public class W1929 {
    public static int check(int ln) {
        int last = 0;
        for (int i = 1; i < (ln); i++) {
            if ((i * i) >= ln) {
                last = i;
                break;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 0;
        // int dc = 0;
        int last = check(num2);
        for (int i = num1; i <= num2; i++) {
            if (i == 1)
                continue;
            for (int j = 2; j <= last; j++) {
                if ((i % j) == 0 && (i != j)) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
                // dc++;
            }
            count = 0;
        }
        sc.close();
        // System.out.println(dc);
    }
}
