import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class HW_20056 {
    static class Fireball{
        int r, c, m, s, d;
        public Fireball(int r, int c, int m, int s, int d){
            this.r = r;
            this.c = c;
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }
    private static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int N, M, K;
    private static List<Fireball>[][] board;
    private static List<Fireball> fireballs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 격자 크기
        M = Integer.parseInt(st.nextToken()); // 파이어볼 개수
        K = Integer.parseInt(st.nextToken()); // 마법상어 이동 명령 횟수
        fireballs = new ArrayList<>();

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1; // (r,c)
            int c = Integer.parseInt(st.nextToken())-1;
            int m = Integer.parseInt(st.nextToken()); // 질량
            int s = Integer.parseInt(st.nextToken()); // 속력
            int d = Integer.parseInt(st.nextToken()); // 방향
            fireballs.add(new Fireball(r, c, m, s, d));
        }

        // 이동한 파이어볼을 새 격자에 저장
        board = new ArrayList[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j] = new ArrayList<>();
            }
        }

        while(K-->0) {
            move();
            simluation();
        }
        int ans = 0;
        for(Fireball f : fireballs){
            ans += f.m;
        }

        System.out.println(ans);
    }
    private static void move(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                board[i][j].clear();
            }
        }
        for(Fireball f : fireballs){
            f.r = (N + f.r + dx[f.d] * (f.s % N)) % N;
            f.c = (N + f.c + dy[f.d] * (f.s % N)) % N;

            board[f.r][f.c].add(f);
        }
    }
    private static void simluation(){
        List<Fireball> newFireballs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int size = board[i][j].size();
                if (size == 0) continue;

                if (size == 1) {
                    newFireballs.add(board[i][j].get(0));
                } else {
                    int mSum = 0, sSum = 0;
                    boolean allEven = true, allOdd = true;

                    for (Fireball f : board[i][j]) {
                        mSum += f.m;
                        sSum += f.s;
                        if (f.d % 2 == 0) allOdd = false;
                        else allEven = false;
                    }

                    int newM = mSum / 5;
                    if (newM == 0) continue;
                    int newS = sSum / size;
                    int[] dirs = (allEven || allOdd) ? new int[]{0, 2, 4, 6} : new int[]{1, 3, 5, 7};

                    for (int d : dirs) {
                        newFireballs.add(new Fireball(i, j, newM, newS, d));
                    }
                }
            }
        }

        fireballs = newFireballs;
    }
}