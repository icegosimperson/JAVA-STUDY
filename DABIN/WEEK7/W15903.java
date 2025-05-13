package DABIN.WEEK7;

import java.util.*;

public class W15903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 카드 개수
        int m = sc.nextInt(); // 합체 횟수

        PriorityQueue<Long> queue = new PriorityQueue<>();
              

        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextLong());
        }

        for (int i = 0; i < m; i++) {
            long first = queue.poll();
            long second = queue.poll();
            long sum = first + second;
            queue.offer(sum);
            queue.offer(sum);
        }

        long result = 0;
        while (!queue.isEmpty()) {
            result += queue.poll();
        }

        System.out.println(result);
        sc.close();
    }
}
