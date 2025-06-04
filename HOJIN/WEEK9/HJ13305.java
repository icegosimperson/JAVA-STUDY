import java.util.*;
import java.io.*;

public class HJ13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] distances = new int[N - 1];
        int[] prices = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++) {
            distances[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            prices[i] = Integer.parseInt(st.nextToken());
        }

//        for(int d : distances) {
//            System.out.print(d + " ");
//        }
//        System.out.println();
//        for(int p : prices) {
//            System.out.print(p + " ");
//        }
//        System.out.println();

        long totalPrice= 0;
        long distance = distances[0];
        long minPrice = prices[0];

        for(int i = 1; i < N - 1; i++) {
            if(minPrice > prices[i]) {
                totalPrice += (distance * minPrice);
                minPrice = prices[i];
                distance = distances[i];
            } else {
                distance += distances[i];
            }
        }

        totalPrice += (distance * minPrice);

        bw.write(String.valueOf(totalPrice));
        bw.flush();
        bw.close();
        br.close();
    }
}
