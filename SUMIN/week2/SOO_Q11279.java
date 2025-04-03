package SUMIN.week2;

import java.io.*;
import java.util.*;

public class SOO_Q11279 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //큰 값이 우선순위를 갖도록 Collections.reverseOrder()사용
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < num; i++) {
            int order = Integer.parseInt(br.readLine());

            if (order == 0) {
                if (!maxQueue.isEmpty()) System.out.println(maxQueue.poll());
                else System.out.println(0);
            }
            if (order > 0) {
                maxQueue.add(order);
            }


        }
    }
}
