package SUMIN.week3;

import java.util.*;
import java.io.*;
public class SOO_Q2667 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static List<Integer> houseCounts = new ArrayList<>();
    static int[] dx = {-1, 1, 0, 0}; // 상하
    static int[] dy = {0, 0, -1, 1}; // 좌우
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력: 지도 크기 N
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];

        // 입력: 지도 정보
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        // 모든 위치를 순회하며 단지 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 집이 있고, 아직 방문하지 않았다면 새로운 단지 발견
                if (map[i][j] == 1 && !visited[i][j]) {
                    int houseCount = dfs(i, j);
                    houseCounts.add(houseCount);
                }
            }
        }

        // 결과 출력
        Collections.sort(houseCounts);
        System.out.println(houseCounts.size()); // 총 단지 수
        for (int count : houseCounts) {
            System.out.println(count); // 각 단지 내 집의 수
        }
    }

    // DFS를 통한 단지 탐색
    public static int dfs(int x, int y) {
        visited[x][y] = true;
        int count = 1; // 현재 집 포함

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 지도 범위 내에 있고, 집이 있으며, 아직 방문하지 않았다면 탐색 계속
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (map[nx][ny] == 1 && !visited[nx][ny]) {
                    count += dfs(nx, ny);
                }
            }
        }
        return count;
    }
}
