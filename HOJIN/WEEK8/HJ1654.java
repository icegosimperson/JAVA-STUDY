import java.util.*;
import java.io.*;

/*
반레:
2 2
2147483645
2147483645
 */

public class HJ1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lans = new int[K];
        for(int i = 0; i < K; i++) {
            lans[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(lans); //457 -> 539 -> 743 -> 802
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long a, Long b) {
                return Long.compare(b, a);
            }
        });

        long maxLength = 0;
        while(true) {
            maxLength++;
            long cnt = 0;
            for(int lan : lans) {
                cnt += lan / maxLength;
                if(cnt >= N) maxHeap.offer(maxLength);
            }
            if(cnt < N) break; //이게 upperbound, lowerbound구나
        }
        long result = maxHeap.poll();

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
