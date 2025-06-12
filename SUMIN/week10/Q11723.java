package SUMIN.week10;

import java.util.*;
import java.io.*;

public class Q11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int S = 0;
        int M = Integer.parseInt(br.readLine());

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            int num = 0;

            switch (str) {
                case "add" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S = S | (1 << num);
                    break;
                case "remove" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S = S & ~(1 << num);
                    break;
                case "check" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    int temp = S & (1 << num);
                    sb.append(((temp == 0) ? 0 : 1)).append("\n");
                    break;
                case "toggle" :
                    num = Integer.parseInt(st.nextToken()) - 1;
                    S = S ^ (1 << num);
                    break;
                case "all" :
                    S = (1 << 21) -1;
                    break;
                case "empty" :
                    S = 0;
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
