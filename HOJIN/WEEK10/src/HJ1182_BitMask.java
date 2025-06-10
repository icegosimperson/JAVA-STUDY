import java.util.*;
import java.io.*;

public class HJ1182_BitMask {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] nums = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 1; i < (1 << N); i++) {
            int sum = 0;
            for(int j = 0; j < N; j++) {
                if((i & (1 << j)) != 0) {
                    sum += nums[j];
                }
            }
            if(sum == S) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
