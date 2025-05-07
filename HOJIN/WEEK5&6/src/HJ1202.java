import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/*
1. 보석 무게 -> 보석 가격 순으로 오름차순 정렬
2. 가방 무게 순으로 오름차순 정렬
3. 각 가방보다 같거나 작은
 */

public class HJ1202 {
    private static int N, K;
    private static int[][] jewels;
    private static int[] bags;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        jewels = new int[N][2];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewels[i][0] = Integer.parseInt(st.nextToken());
            jewels[i][1] = Integer.parseInt(st.nextToken());
        }

        bags = new int[K];
        for(int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }

        //1. 보석 무게 2. 보석 가격 -> 기준으로 오름차순 정렬
        Arrays.sort(jewels, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            }
        });

        //1. 가방 무게 기준으로 오름차순 정렬
        Arrays.sort(bags);

        int price = 0;

        for(int i = 0; i < jewels)

    }
}
