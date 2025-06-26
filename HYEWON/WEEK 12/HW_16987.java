import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_16987{
    static class Egg{
        int s, w;
        public Egg(int s, int w){
            this.s = s;
            this.w = w;
        }
        boolean isBroken(){
            return s <= 0; // 내구도
        }
    }
    private static int N, ans = 0;
    private static Egg[] eggs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine()); // 계란의 개수

        eggs = new Egg[N];
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            eggs[i] = new Egg(S, W);
        }
        backtracking(0, 0);
        System.out.println(ans);
    }
    private static void backtracking(int depth, int cnt){
        if(depth == N){
            ans = Math.max(ans, cnt);
            return;
        }
        if (eggs[depth].isBroken()) {
            backtracking(depth + 1, cnt); // 다음 계란으로 넘어감
            return;
        }
        boolean isHit = false;
        for (int i = 0; i < N; i++) {
            if (i == depth || eggs[i].isBroken()) continue;

            isHit = true;

            // 계란끼리 부딪힘
            eggs[depth].s -= eggs[i].w;
            eggs[i].s -= eggs[depth].w;

            int broken = 0;
            if (eggs[depth].isBroken()) broken++;
            if (eggs[i].isBroken()) broken++;

            backtracking(depth + 1, cnt + broken);

            // 되돌리기
            eggs[depth].s += eggs[i].w;
            eggs[i].s += eggs[depth].w;
        }
        if (!isHit) {
            backtracking(depth + 1, cnt); // 때릴 계란이 없으면 넘어가기
        }
    }
}