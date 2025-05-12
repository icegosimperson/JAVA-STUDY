import java.util.*;
import java.io.*;

public class HJ19598 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        List<int[]> meetings = new ArrayList<>();

        StringTokenizer st = null;
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] curr = new int[2];
            curr[0] = Integer.parseInt(st.nextToken());
            curr[1] = Integer.parseInt(st.nextToken());
            meetings.add(curr);
        }

        Collections.sort(meetings, (m1, m2) -> (m1[0] - m2[0]));

        PriorityQueue<Integer> endTime = new PriorityQueue<>();
        endTime.offer(meetings.get(0)[1]);
        int cnt = 1;
        for(int i = 1; i < N ; i++) {
            int nextStartTime = meetings.get(i)[0];
            int nextEndTime = meetings.get(i)[1];
            if(endTime.peek() <= nextStartTime) {
                endTime.poll();
                endTime.offer(nextEndTime);
            } else {
                endTime.offer(nextEndTime);
            }
        }

        br.close();
        bw.write(String.valueOf(endTime.size()));
        bw.flush();
        bw.close();
    }
}
