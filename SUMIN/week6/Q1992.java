package SUMIN.week6;
import java.util.*;
import java.io.*;

public class Q1992 {
    static int[][] video;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        video = new int[N][N];

        for (int i = 0; i < N; i++) {
            String num = br.readLine();
            for (int j = 0; j < N; j++) {
                video[i][j] = Character.getNumericValue(num.charAt(j));
            }
        }

    }

    public static void division(int x, int y, int N) {

        if(check(x, y, N)) {

            return;
        }

        int size = N / 2;

        //맨위 왼쪽
        division(x, y, size);
        //맨위오른쪽
        division(x, y+size, size);
        //아래 왼쪽
        division(x+size, y, size);
        //아래 오른쪾
        division(x+size, y+size, size);

    }

    public static boolean check(int x, int y, int N) {
        if (N == 1) return true;

        return true;
    }

}


//8
//        11110000
//        11110000
//        00011100
//        00011100
//        11110000
//        11110000
//        11110011
//        11110011