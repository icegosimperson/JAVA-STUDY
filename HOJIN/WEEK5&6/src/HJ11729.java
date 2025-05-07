import java.io.*;

public class HJ11729 {
    private static StringBuilder sb = new StringBuilder();
    private static int moveCnt = 0;

    //n : 지금 옮기려는 원판의 수, from: 시작, to: 목표, via: 경유
    private static void hanoi(int n, int from, int to, int via) {
        if(n == 1) { // 현재 옮기려는 원판의 수가 1개일 때
            moveCnt++;
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        hanoi(n - 1, from, via, to);
        moveCnt++;
        sb.append(from).append(" ").append(to).append("\n");
        hanoi(n-1, via, to, from);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        hanoi(N, 1, 3, 2);
        sb.insert(0, moveCnt + "\n");

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
