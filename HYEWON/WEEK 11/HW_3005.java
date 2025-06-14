import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class BOJ_3005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb;
        List<String> words = new ArrayList<>();

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        char[][] board = new char[R][C];

        for (int i = 0; i < R; i++) {
            String input = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = input.charAt(j);
            }
        }

        // 가로 단어 추출
        for (int i = 0; i < R; i++) {
            sb = new StringBuilder();
            for (int j = 0; j < C; j++) {
                char c = board[i][j];
                if (c == '#') {
                    if (sb.length() >= 2) words.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() >= 2) words.add(sb.toString());
        }

        // 세로 단어 추출
        for (int j = 0; j < C; j++) {
            sb = new StringBuilder();
            for (int i = 0; i < R; i++) {
                char c = board[i][j];
                if (c == '#') {
                    if (sb.length() >= 2) words.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() >= 2) words.add(sb.toString());
        }

        Collections.sort(words);
        System.out.println(words.get(0)); // 첫번째 단어 출력
    }
}