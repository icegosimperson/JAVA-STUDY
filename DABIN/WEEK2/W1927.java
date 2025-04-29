package DABIN.WEEK2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class W1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> que = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int code = Integer.parseInt(br.readLine());

            if (code == 0) {
                if (que.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(que.poll());
            } else
                que.add(code);
        }
    }
}
