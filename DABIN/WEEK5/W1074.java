package DABIN.WEEK5;

import java.util.Scanner;

public class W1074 {
    static int count = 0;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        Zsearch(N, r, c);
        System.out.println(result);
        sc.close();
    }

    static void Zsearch(int n, int r, int c) {
        if (n == 0) {
            result = count;
            return;
        }

        int half = 1;
        for(int i=0;i<n-1;i++){
            half*=2;
        } // 현재 사분면 길이
        int area = half * half;

        if (r < half && c < half) {
            // 0번 사분면
            Zsearch(n - 1, r, c);
        } else if (r < half && c >= half) {
            // 1번 사분면
            count += area;
            Zsearch(n - 1, r, c - half);
        } else if (r >= half && c < half) {
            // 2번 사분면
            count += 2 * area;
            Zsearch(n - 1, r - half, c);
        } else {
            // 3번 사분면
            count += 3 * area;
            Zsearch(n - 1, r - half, c - half);
        }
    }
}

