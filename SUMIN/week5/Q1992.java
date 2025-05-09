package SUMIN.week5;
import java.util.*;
import java.io.*;

public class Q1992 {
    static int[][] video;
    static StringBuilder sb = new StringBuilder();
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

        division(0, 0, N);
        System.out.println(sb);

    }

    public static void division(int x, int y, int N) {

        if(check(x, y, N)) {
            sb.append(video[x][y]);
            return;
        }

        sb.append("("); //시작 괄호 추가

        int size = N / 2;

        //맨위 왼쪽
        division(x, y, size);
        //맨위오른쪽
        division(x, y+size, size);
        //아래 왼쪽
        division(x+size, y, size);
        //아래 오른쪽
        division(x+size, y+size, size);

        sb.append(")"); //끝 괄호 추가

    }

    public static boolean check(int x, int y, int N) {
        if (N == 1) return true;
        int firstNum = video[x][y];
        for (int i = x; i < x+N; i++) {
            for (int j = y; j < y+N; j++) {
                if (video[i][j] != firstNum) return false;
            }
        }
        return true;
    }

}
