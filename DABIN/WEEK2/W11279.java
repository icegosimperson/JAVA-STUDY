package DABIN.WEEK2;

import java.io.*;
import java.util.*;

public class W11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (que.isEmpty())
                    sb.append("0").append("\n");
                else
                    sb.append(que.poll()).append("\n");
            } else
                que.offer(num);
        }
        System.out.println(sb);
    }
}
