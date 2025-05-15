package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(br.readLine());
            pq.add(card[i]);
        }

        int answer = 0;

        while(!pq.isEmpty()) {
            int value1 = pq.poll();

            if (pq.isEmpty()) {
                System.out.println(answer);
                return;
            } else {
                int value2 = pq.poll();
                answer += value1 + value2;
                pq.add(value1 + value2);
            }
        }


    }
}
