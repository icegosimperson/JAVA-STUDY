import java.util.*;
import java.io.*;

public class HJ21278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] dist = new int[N][N];
        for(int[] node : dist) {
            Arrays.fill(node, 100); //거리의 최댓값을 문제 조건에 맞게 100으로 설정
        }

        //graph 입력
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken()) - 1;
            int to = Integer.parseInt(st.nextToken()) - 1;

            dist[from][to] = 1;
            dist[to][from] = 1;
        }

        for(int k = 0; k < N; k++){
            dist[k][k] = 0;
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        //상위 2개 고르기
        long minTotal = Long.MAX_VALUE;
        int answer1 = 0, answer2 = 0;

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {//i, j는 각 건물번호(2개의 조합으로 번호가 작은것이 앞으로)
                long total = 0;
                for(int k = 0; k < N; k++) {
                    if(k == i || k == j) continue;

                    total += Math.min(dist[k][i], dist[k][j]) * 2;
                }

                if(total < minTotal) {
                    minTotal = total;
                    answer1 = i;
                    answer2 = j;
                }
            }
        }

        br.close();
        bw.write((answer1 + 1) + " " + (answer2 + 1) + " " + minTotal);
        bw.flush();
        bw.close();
    }
}
