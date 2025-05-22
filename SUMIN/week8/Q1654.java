package SUMIN.week8;

import java.util.*;
import java.io.*;

public class Q1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        int[] cable = new int[count];
        long max = 0;
        for (int i = 0; i < count; i++) {
            cable[i] = Integer.parseInt(br.readLine());
            max = Math.max(cable[i], max);
        }
        long answer = binary_search(cable, size, max);
        System.out.println(answer);

    }

    static long binary_search(int[] cable, int size, long max) {
        long half = 0;
        long min = 1;

        while (min <= max) {
            half = (max + min) / 2;
            int cnt = 0;
            for (int num : cable) {
                cnt += num / half;
            }

            if (cnt < size) {
                max = half - 1;
            } else {
                min = half + 1;
            }
        }
        return max;
    }
}
