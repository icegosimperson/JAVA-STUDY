package SUMIN.week5;

import java.io.*;
//하노이 탑 이동 순서
public class Q11729 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        move(N, 1, 3, 2);
        System.out.println(cnt);
        System.out.println(sb);
    }

    public static void move(int N, int from, int to, int temp) {
        if (N == 1) {
            cnt++;
            sb.append(from).append(" ").append(to).append("\n");
            return;
        } else {
            move(N-1, from, temp, to);
            sb.append(from).append(" ").append(to).append("\n");
            cnt++;
            move(N-1, temp, to, from);
        }
    }
}
