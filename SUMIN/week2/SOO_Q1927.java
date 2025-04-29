package SUMIN.week2;

import java.io.*;
import java.util.*;

public class SOO_Q1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        //우선순위 큐 선언 + 최소힙(작은 숫자가 먼저 나오도록)
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();

        StringTokenizer st;

        for (int i = 0; i < num; i++) {
//            st = new StringTokenizer(br.readLine());
//            int order = Integer.parseInt(st.nextToken());


            //그냥 br만 사용하는게 메모리나 시간적으로 더 효율적
            int order = Integer.parseInt(br.readLine());

            if (order == 0) {
                if (!minQueue.isEmpty()) System.out.println(minQueue.poll());
                else System.out.println(0);
            }

            if (order > 0) {
                minQueue.add(order);
            }
        }
    }
}
