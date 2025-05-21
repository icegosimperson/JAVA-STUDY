package DABIN.WEEK7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class W15683 {
    static char[][] room;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        room = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine().replace(" ", "");
            room[i] = line.toCharArray();
            // System.out.println("");
        }
        br.close();
        // System.out.println("");
        // for (int i = 0; i < N; i++) {
        // for (int j = 0; j < M; j++) {
        // System.out.print(room[i][j] + " ");
        // }
        // System.out.println("");
        // }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                switch (room[i][j]) {
                    case '1':
                        checkOne(i, j);
                        break;
                    case '2':
                        checkTwo(i, j);
                        break;
                    case '3':
                        checkThree(i, j);
                        break;
                    case '4':
                        checkFour(i, j);
                        break;
                    case '5':
                        checkFive(i, j);
                        break;
                    default:
                        break;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (room[i][j] == '0') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void up(int n, int m) {
        // 위
        for (int i = n - 1; i >= 0; i--) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                room[i][m] = '#';
            }
        }
    }

    public static void down(int n, int m) {
        for (int i = n + 1; i < N; i++) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                room[i][m] = '#';
            }
        }
    }
    
    public static void left(int n, int m) {
        for (int i = m - 1; i >= 0; i--) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                room[n][i] = '#';
            }
        }
    }
    
    public static void right(int n, int m) {
        for (int i = m + 1; i < M; i++) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                room[n][i] = '#';
            }
        }
    }
    public static void checkOne(int n, int m) {
        int up, down, left, right;
        up = down = left = right = 0;
        // 위
        for (int i = n - 1; i >= 0; i--) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                up++;
            }
        }
        // 아래
        for (int i = n + 1; i < N; i++) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                down++;
            }
        }
        // 오른쪽
        for (int i = m + 1; i < M; i++) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                right++;
            }
        }
        // 왼쪽
        for (int i = m - 1; i >= 0; i--) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                left++;
            }
        }
        Map<String, Integer> directionMap = new HashMap<>();
        directionMap.put("up", up);
        directionMap.put("down", down);
        directionMap.put("left", left);
        directionMap.put("right", right);

        String maxDir = Collections.max(directionMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        switch (maxDir) {
            case "up":
                up(n, m);
                break;
            case "down":
                down(n, m);
                break;
            case "left":
                left(n, m);
                break;
            case "right":
                right(n, m);
                break;
        }

    }

    public static void checkTwo(int n, int m) {
        int up, down, left, right;
        up = down = left = right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                up++;
            }
        }
        // 아래
        for (int i = n + 1; i < N; i++) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                down++;
            }
        }
        // 오른쪽
        for (int i = m + 1; i < M; i++) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                right++;
            }
        }
        // 왼쪽
        for (int i = m - 1; i >= 0; i--) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                left++;
            }
        }
        Map<String, Integer> directionMap = new HashMap<>();
        directionMap.put("ud", up + down);
        directionMap.put("lr", left + right);
        String maxDir = Collections.max(directionMap.entrySet(), Map.Entry.comparingByValue()).getKey();

        switch (maxDir) {
            case "ud":
                //위
                up(n, m);
                // 아래
                down(n, m);
                break;

            case "lr":
                //오른쪽
                right(n, m);
                // 왼쪽
                left(n, m);
                break;

            default:
                break;
        }
    }


    public static void checkThree(int n, int m) {
        int up, down, left, right;
        up = down = left = right = 0;
        //위
        for (int i = n - 1; i >= 0; i--) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                up++;
            }
        }
        // 아래
        for (int i = n + 1; i < N; i++) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                down++;
            }
        }
        // 오른쪽
        for (int i = m + 1; i < M; i++) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                right++;
            }
        }
        // 왼쪽
        for (int i = m - 1; i >= 0; i--) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                left++;
            }
        }

        Map<String, Integer> directionMap = new HashMap<>();
        directionMap.put("ur", up + right);
        directionMap.put("dr", down + right);
        directionMap.put("ul", up + left);
        directionMap.put("dl", down + left);
        String maxDir = Collections.max(directionMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        switch (maxDir) {
            case "ur":
                // 위
                up(n, m);
                right(n, m);
                break;
            case "dr":
                down(n, m);
                right(n, m);
                break;

            case "ul":
                up(n, m);
                left(n, m);
                break;
            
            case "dl":
                down(n, m);
                left(n, m);
                break;
        
            default:
                break;
        }
    }

    public static void checkFour(int n, int m) {
        int up, down, left, right;
        up = down = left = right = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                up++;
            }
        }
        // 아래
        for (int i = n + 1; i < N; i++) {
            if (room[i][m] == '6')
                break;
            if (room[i][m] == '0') {
                down++;
            }
        }
        // 오른쪽
        for (int i = m + 1; i < M; i++) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                right++;
            }
        }
        // 왼쪽
        for (int i = m - 1; i >= 0; i--) {
            if (room[n][i] == '6')
                break;
            if (room[n][i] == '0') {
                left++;
            }
        }

        Map<String, Integer> directionMap = new HashMap<>();
        directionMap.put("lur", up + right + left);
        directionMap.put("urd", up + down + right);
        directionMap.put("rdl", right + down + left);
        directionMap.put("dlu", down + left + up);
        String maxDir = Collections.max(directionMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        switch (maxDir) {
            case "lur":
                // 위
                up(n, m);
                right(n, m);
                left(n, m);
                break;
            case "urd":
                down(n, m);
                right(n, m);
                up(n, m);
                break;

            case "rdl":
                right(n, m);
                down(n, m);
                left(n, m);
                break;

            case "dlu":
                down(n, m);
                left(n, m);
                up(n, m);
                break;

            default:
                break;
        }
    }

    public static void checkFive(int n, int m) {
        up(n, m);
        down(n, m);
        left(n, m);
        right(n, m);
    }
}
