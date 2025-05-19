package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q15903 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int card = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < card; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        long x;
        long y;
        long sum;
        long answer = 0;

        for (int i = 0; i < num; i++) {
            x = pq.poll(); // 제일 작은 값
            y = pq.poll(); // 두번 째로 작은 값
            sum = x + y;
            pq.add(sum);
            pq.add(sum);
        }

        while(!pq.isEmpty()) {
            answer += pq.poll();
        }

        System.out.println(answer);
    }

}
