import java.io.*;
import java.util.*;

public class HJ1654_BinarySearch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        //lan선 입력
        long[] lans = new long[K];
        for(int i = 0; i < K; i++) {
            lans[i] = Integer.parseInt(br.readLine());
        }

        //이분탐색을 위한 정렬
        Arrays.sort(lans);

        long start = 1;
        long end = lans[lans.length - 1] + 1;

        while(start <= end) {
            long mid = (start + end) / 2;
            long cnt = 0;
            for(long lan : lans) {
                cnt += lan / mid;
            }
            //mid <= target 인 경우
            if(N <= cnt) {
                start = mid + 1;
            } else { //target < mid 인 경우
                end = mid - 1;
            }
        }

        /*
        upperbound -> arr[mid] <= target
        lowerbound -> arr[mid] < target
         */

        br.close();
        bw.write(String.valueOf(start - 1));
        bw.flush();
        bw.close();
    }
}
