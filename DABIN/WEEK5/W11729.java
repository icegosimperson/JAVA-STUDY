package DABIN.WEEK5;

import java.util.*;

public class W11729 {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 1;
        for (int i = 0; i < N; i++) {
            result *= 2;
        }

        System.out.println(result - 1); // ✅ 이동 횟수 출력
        hanoi(N, 1, 2, 3);              // 이동 경로 기록
        System.out.print(sb);

        sc.close();
    }

    static void hanoi(int n, int from, int via, int to) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append('\n');
            return;
        }

        hanoi(n - 1, from, to, via);
        sb.append(from).append(" ").append(to).append('\n');
        hanoi(n - 1, via, from, to);
    }
}
