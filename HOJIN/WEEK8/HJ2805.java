import java.io.*;
import java.util.*;

public class HJ2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] trees = new int[N];
        for(int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(trees);

        int start = 1;
        int end = trees[N - 1];
        while(start <= end) {
            int mid = (start + end) / 2;
            long bring = 0; //입력과 중간연산 범위 잘 확인!!
            for(int tree : trees) {
                if(tree <= mid) continue;
                bring += (tree - mid);
                if(bring > M) break; //이미 가져갈 양을 만족했기 때문에 for문 종료
            }

            if(M <= bring) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        br.close();
        bw.write(String.valueOf(start - 1)); //end 출력해도 같음
        bw.flush();
        bw.close();
    }
}
