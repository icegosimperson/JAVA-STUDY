import java.util.*;
import java.io.*;

public class HJ1715_PriorityQueue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> cards = new PriorityQueue<Integer>();

        for(int i = 0; i < N; i++) {
            cards.offer(Integer.parseInt(br.readLine()));
        }

        //각 카드의 비교횟수 누적
        int sum = 0;
        while(cards.size() > 1) {
            int a = cards.poll();
            int b = cards.poll();
            int curr = (a + b);
            sum += curr;
            cards.offer(curr);
        }

        br.close();
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
