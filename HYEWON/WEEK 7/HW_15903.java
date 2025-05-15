import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
카드 합쳐서 가장 작은 점수를 만드는 프로그램
작은 수끼리 더해서 작은 수를 만들어야함
m <= 10^6
 */
class HW_15903{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 카드의 개수
        int m = Integer.parseInt(st.nextToken()); // 카드 합체를 몇번 하는지 나타내는 수

        PriorityQueue<Long> pq = new PriorityQueue<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            pq.offer(Long.parseLong(st.nextToken()));
        }

        for(int i=0; i<m; i++){
            long a = pq.poll();
            long b = pq.poll();
            long temp = a + b;
            a = temp;
            b = temp;
            pq.offer(a);
            pq.offer(b);
        }

        long ans = 0;
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        System.out.println(ans);

    }
}