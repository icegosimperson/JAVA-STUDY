package SUMIN.week5;

import java.util.*;
import java.io.*;
public class Q1074 {
    static int result = 0;
    static int r, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        division(0,0, (int) Math.pow(2, N));
        System.out.println(result);
    }

    public static void division(int x, int y, int size) {
        if (size == 1) return;

        int half = size/2;
        int square = half * half;
        if (r < x + half && c < y + half) {
            //1사분면
            division(x, y, half);
        } else if (r  < x+half && c >= y+half) {
            //2사분면
            result += square; //1사분면의 칸수 누적
            division(x, y+half, half);
        } else if (r >= x+half && c < y + half) {
            //3사분면
            result += 2*square;
            division(x+half, y, half);
        } else {
            //4사분면
            result += 3*square;
            division(x+half, y+half, half);
        }

    }
}
