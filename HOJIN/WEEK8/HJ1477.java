import java.io.*;
import java.util.*;

public class HJ1477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 기존 휴게소 수
        int M = Integer.parseInt(st.nextToken()); // 추가로 지을 수 있는 휴게소 수
        int L = Integer.parseInt(st.nextToken()); // 고속도로 길이

        st = new StringTokenizer(br.readLine());
        List<Integer> rests = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            rests.add(Integer.parseInt(st.nextToken()));
        }
        rests.add(0);
        rests.add(L);
        Collections.sort(rests);

        int start = 1;
        int end = L;

        //lower bound 문제
        while(start < end) {
            int mid = (start + end) / 2;
            int cnt = 0;
            for (int i = 1; i < rests.size(); i++) { //
                int distance = rests.get(i) - rests.get(i - 1);
                cnt += (distance - 1) / mid;
            }
            if (M < cnt) start = mid + 1;
            else {
                end = mid;
            }
        }

        br.close();
        bw.write(String.valueOf(start));
        bw.flush();
        bw.close();
    }
}
