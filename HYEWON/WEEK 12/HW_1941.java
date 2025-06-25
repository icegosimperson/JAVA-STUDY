import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class HW_1941 {
    static class Node {
        int x, y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static char[][] arr = new char[5][5];
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static boolean[] selected = new boolean[25];
    private static int ans = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String input = br.readLine();
            for (int j = 0; j < 5; j++) {
                arr[i][j] = input.charAt(j);
            }
        }
        backtracking(0, 0, 0);
        System.out.println(ans);
    }

    private static void backtracking(int idx, int depth, int sCount) {
        if (depth == 7) {
            if (sCount >= 4 && bfs()) {
                ans++;
            }
            return;
        }
        if (idx >= 25) return;

        selected[idx] = true;
        int x = idx / 5;
        int y = idx % 5;
        backtracking(idx + 1, depth + 1, sCount + (arr[x][y] == 'S' ? 1 : 0));
        selected[idx] = false;
        backtracking(idx + 1, depth, sCount);
    }

    private static boolean bfs() {
        Queue<Node> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[5][5];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            if (selected[i]) list.add(i);
        }

        int start = list.get(0);
        int sx = start / 5;
        int sy = start % 5;
        queue.add(new Node(sx, sy));
        visited[sx][sy] = true;

        int count = 1;

        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            for (int k = 0; k < 4; k++) {
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if (isValid(nx, ny) && !visited[nx][ny] && selected[nx * 5 + ny]) {
                    visited[nx][ny] = true;
                    queue.add(new Node(nx, ny));
                    count++;
                }
            }
        }

        return count == 7;
    }

    private static boolean isValid(int nx, int ny) {
        return nx >= 0 && nx < 5 && ny >= 0 && ny < 5;
    }
}