import java.util.*;
import java.io.*;
public class HJ16953_BFS {
    private static class Point{
        long num;
        int cnt;

        public Point(long num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Deque<Point> deque = new ArrayDeque<>();
        deque.offerLast(new Point(A, 0));


        int minCnt = -1;
        while(!deque.isEmpty()) {
            Point curr = deque.pollFirst();
            if(curr.num == B) {
                minCnt = curr.cnt;
                break;
            }
            if(curr.num > B) continue;
            deque.offerLast(new Point(curr.num * 2, curr.cnt + 1));
            deque.offerLast(new Point(curr.num * 10 + 1, curr.cnt + 1));
        }


        bw.write(String.valueOf(minCnt == -1 ? -1 : minCnt + 1));
        bw.flush();
        bw.close();
        br.close();
    }
}
