import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SJ_1920 {
    static int[] origin;
    static int[] check;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        origin = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        check = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(origin);


        binarySearch(bw,sb);
        bw.flush();
        bw.close();
        br.close();


    }

    public static void binarySearch( BufferedWriter bw,StringBuilder sb) throws IOException {
        for (int i = 0; i < check.length; i++) {
            int result = Arrays.binarySearch(origin, check[i]);
            sb.append(result >= 0 ? "1\n" : "0\n");
        }
        bw.write(sb.toString());
    }


}
