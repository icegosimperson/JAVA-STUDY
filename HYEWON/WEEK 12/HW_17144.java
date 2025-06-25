import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HW_17144 {
    private static int R, C, T;
    private static int[][] arr;
    private static int airCleanerTop = -1;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());

        arr = new int[R][C];

        for (int i = 0; i < R; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < C; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == -1 && airCleanerTop == -1) {
                    airCleanerTop = i;  // 위쪽 공기청정기 위치 저장
                }
            }
        }

        while (T-- > 0) {
            spread();       // 1단계: 미세먼지 확산
            simulation();   // 2단계: 공기청정기 작동
        }

        // 남아있는 미세먼지 양 계산
        int total = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] > 0) {
                    total += arr[i][j];
                }
            }
        }

        System.out.println(total);
    }

    private static void spread() {
        int[][] temp = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] > 0) {
                    int spread = arr[i][j] / 5;
                    int cnt = 0;

                    for (int d = 0; d < 4; d++) {
                        int nx = i + dx[d];
                        int ny = j + dy[d];
                        if (isValid(nx, ny) && arr[nx][ny] != -1) {
                            temp[nx][ny] += spread;
                            cnt++;
                        }
                    }

                    temp[i][j] -= spread * cnt;
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] += temp[i][j];
            }
        }
    }

    private static void simulation() {
        int bottom = airCleanerTop + 1;

        // 위쪽
        for (int i = airCleanerTop - 1; i > 0; i--) arr[i][0] = arr[i - 1][0];
        for (int j = 0; j < C - 1; j++) arr[0][j] = arr[0][j + 1];
        for (int i = 0; i < airCleanerTop; i++) arr[i][C - 1] = arr[i + 1][C - 1];
        for (int j = C - 1; j > 1; j--) arr[airCleanerTop][j] = arr[airCleanerTop][j - 1];
        arr[airCleanerTop][1] = 0;

        // 아래쪽
        for (int i = bottom + 1; i < R - 1; i++) arr[i][0] = arr[i + 1][0];
        for (int j = 0; j < C - 1; j++) arr[R - 1][j] = arr[R - 1][j + 1];
        for (int i = R - 1; i > bottom; i--) arr[i][C - 1] = arr[i - 1][C - 1];
        for (int j = C - 1; j > 1; j--) arr[bottom][j] = arr[bottom][j - 1];
        arr[bottom][1] = 0;
    }

    private static boolean isValid(int x, int y) {
        return 0 <= x && x < R && 0 <= y && y < C;
    }
}