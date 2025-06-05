import java.io.*;
import java.util.*;

public class HJ20056 {
    private static int N, M, K;
    private static int[][] dir = {
            {-1, 0}, {-1, 1}, {0, 1}, {1, 1},
            {1, 0}, {1, -1}, {0, -1}, {-1, -1}
    };

    private static class FireBall {
        int x, y, m, d, s;
        public FireBall(int x, int y, int m, int d, int s) {
            this.x = x;
            this.y = y;
            this.m = m;
            this.d = d;
            this.s = s;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()); // N, M, K 입력
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        List<FireBall>[][] grid = new ArrayList[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = new ArrayList<>();
            }
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            int m = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            grid[x][y].add(new FireBall(x, y, m, d, s));
        }

        while (K-- > 0) {
            List<FireBall>[][] newGrid = new ArrayList[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    newGrid[i][j] = new ArrayList<>();
                }
            }

            // FireBall 이동
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    for (FireBall fb : grid[i][j]) {
                        int nx = (fb.x + ((dir[fb.d][0] * fb.s) % N) + N) % N;
                        int ny = (fb.y + ((dir[fb.d][1] * fb.s) % N) + N) % N;
                        newGrid[nx][ny].add(new FireBall(nx, ny, fb.m, fb.d, fb.s));
                    }
                }
            }

            // 병합 + 분할
            grid = new ArrayList[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    grid[i][j] = new ArrayList<>();
                    if (newGrid[i][j].isEmpty()) continue;

                    if (newGrid[i][j].size() == 1) {
                        grid[i][j].add(newGrid[i][j].get(0));
                    } else {
                        int mSum = 0, sSum = 0;
                        boolean allEven = true;
                        boolean allOdd = true;

                        for (FireBall fb : newGrid[i][j]) {
                            mSum += fb.m;
                            sSum += fb.s;
                            if (fb.d % 2 == 0) allOdd = false;
                            else allEven = false;
                        }

                        int nm = mSum / 5;
                        if (nm == 0) continue;

                        int ns = sSum / newGrid[i][j].size();
                        int[] nds = (allEven || allOdd) ? new int[]{0, 2, 4, 6} : new int[]{1, 3, 5, 7};

                        for (int d : nds) {
                            grid[i][j].add(new FireBall(i, j, nm, d, ns));
                        }
                    }
                }
            }
        }

        // 결과 질량 합산
        int total = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (FireBall fb : grid[i][j]) {
                    total += fb.m;
                }
            }
        }

        bw.write(String.valueOf(total));
        bw.flush();
        br.close();
        bw.close();
    }
}