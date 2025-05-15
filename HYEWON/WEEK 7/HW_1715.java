import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class HW_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while (N-- > 0) {
            int a = Integer.parseInt(br.readLine());
            pq.add(a);
        }
        int sum = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int temp = first + second;
            sum += temp;
            pq.add(temp);
        }
        System.out.println(sum);
    }
}

/* NullPointerException
        while (!pq.isEmpty()) {
            int cur = pq.poll();
            sum = cur + pq.peek();
        }
 */