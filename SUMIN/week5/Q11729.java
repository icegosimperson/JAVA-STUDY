package SUMIN.week5;

import java.io.*;
//하노이 탑 이동 순서
public class Q11729 {
    static int cnt = 0;
    static StringBuilder sb = new StringBuilder();
    private static void move(int N, int from, int to, int temp) {
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

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        move(N, 1, 3, 2);
        sb.insert(0, cnt + "\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }


}
