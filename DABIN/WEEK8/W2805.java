package DABIN.WEEK8;

import java.util.Scanner;

public class W2805 {
    static int count = 0;
    static int N;
    static int M;
    static int[] tr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        long H = 0;
        long start = 0;
        long end = 2000000000;
        tr = new int[N];
        for (int i = 0; i < N; i++) {
            tr[i] = sc.nextInt();
        }
        while (start <= end) {
            int mid = (int) (start + end) / 2;
            if (determination(mid)) {
                H = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        System.out.println(H);
        sc.close();
    }

    private static boolean determination(long high) {
        long sliced = 0;
        for (int tree : tr) {
            if (tree > high) {
                sliced += tree - high;
            }
        }
        return sliced >= M;
    }
}
