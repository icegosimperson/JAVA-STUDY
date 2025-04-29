import java.util.*;
import java.io.*;

public class HJ_2512{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out ));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] regions = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            regions[i] = Integer.parseInt(st.nextToken());
        }

        //예산한도 입력
        int M = Integer.parseInt(br.readLine());
        //예산들 오름차순 정렬
        Arrays.sort(regions);

        //초기값 지정
        int start = 0;
        int end = regions[N - 1];
        int answer = 0;

        while(start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            for(int i = 0; i < N; i++) {
                if(regions[i] <= mid) {
                    sum += regions[i];
                } else sum += mid;
            }

            if(sum <= M) {
                answer = mid;
                start = mid + 1;
            } else end = mid - 1;
        }

        br.close();
        bw.write(sb.append(answer).toString());
        bw.flush();
        bw.close();
    }
}
