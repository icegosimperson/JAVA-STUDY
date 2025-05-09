package SUMIN.week6;

import java.util.*;
import java.io.*;

public class Q17276_RE {

    static int[][] board;
    static int N;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int testcase = Integer.parseInt(br.readLine());
        while(testcase-- > 0) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            int degree = Integer.parseInt(st.nextToken());
            int r = degree/45;

            board = new int[N][N];
            int[][] original = new int[N][N]; //본래 값 저장해두는 배열

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    int value = Integer.parseInt(st.nextToken());
                    board[i][j] = value;
                    original[i][j] = value;
                }
            }

            //함수 실행
            for (int i = 0; i < Math.abs(r); i++) {
                if(degree>0) {
                    clockwise();
                }else {
                    counterclockwise();
                }
            }

            //정답 sb에 저장
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(board[i][j] ==0) board[i][j] = original[i][j];
                    sb.append(board[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public static void clockwise() {
        int[][] dummy = new int[N][N];
        for (int i = 0; i < board.length; i++) {
            dummy[i][N/2] = board[i][i];
            dummy[i][i] = board[N/2][i];
            dummy[N/2][i] = board[N-i-1][i];
            dummy[N-i-1][i] = board[N-i-1][N/2];
        }
        board = dummy;
    }
    public static void counterclockwise() {
        int[][] dummy = new int[N][N];
        for (int i = 0; i < board.length; i++) {
            dummy[i][N/2] = board[i][N-1-i];
            dummy[i][i] = board[i][N/2];
            dummy[N/2][i] = board[i][i];
            dummy[N-i-1][i] = board[N/2][i];
        }
        board = dummy;
    }
}
