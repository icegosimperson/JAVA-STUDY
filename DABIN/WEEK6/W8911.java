package DABIN.WEEK5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class W8911 {
    // 북, 동, 남, 서
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String commands = br.readLine();

            int x = 0, y = 0;        // 현재 위치
            int dir = 0;            // 0: 북, 1: 동, 2: 남, 3: 서

            int minX = 0, maxX = 0, minY = 0, maxY = 0;

            for (char cmd : commands.toCharArray()) {
                if (cmd == 'F') {
                    x += dx[dir];
                    y += dy[dir];
                } else if (cmd == 'B') {
                    x -= dx[dir];
                    y -= dy[dir];
                } else if (cmd == 'L') {
                    dir = (dir + 3) % 4;  // 왼쪽 회전
                } else if (cmd == 'R') {
                    dir = (dir + 1) % 4;  // 오른쪽 회전
                }

                // 이동 후 좌표 업데이트
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y);
            }

            int area = (maxX - minX) * (maxY - minY);
            System.out.println(area);
        }
    }
}
