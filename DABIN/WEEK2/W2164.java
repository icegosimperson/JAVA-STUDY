package DABIN.WEEK2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class W2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<Integer>();

        int check = 1;
        int tn = 0;
        for (int i = 0; i < N; i++) {
            que.offer(i + 1);
        }
        while ((que.size()) != 1) {
            switch (check) {
                case 1:
                    que.poll();
                    check *= -1;
                    break;
                case -1:
                    tn = que.poll();
                    que.offer(tn);
                    check *= -1;
                    break;
                default:
                    break;
            }
        }
        System.out.println(que.poll());
    }
}
