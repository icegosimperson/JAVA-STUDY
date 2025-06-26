package BOSEONG.WEEK10.BOSEONG;
import java.util.*;

public class BS_단체사진찍기 {
  

class Solution {
static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    static boolean[] visited = new boolean[8];
    static String[] current = new String[8];
    static int answer = 0;

    public static int solution(int n, String[] data) {
        answer = 0;
        dfs(0, data);
        return answer;
    }

    // 순열 생성
    static void dfs(int depth, String[] data) {
        if (depth == 8) {
            if (isValid(data)) answer++;
            return;
        }

        // 문자 8개 중에서 방문 했는지 안했는지 따져야하고
        // 각 문자의 위치를 저장 해놓기
        for (int i = 0; i < 8; i++) {
            if (!visited[i]) {
                visited[i] = true;
                current[depth] = friends[i];
                dfs(depth + 1, data);
                visited[i] = false;
            }
        }
    }

    // 조건 검사
    static boolean isValid(String[] data) {
        Map<String, Integer> pos = new HashMap<>();
        // 여기 오면 8자리 다 맞춘거기 때문에 여기서 문자랑 위치 저장
        for (int i = 0; i < 8; i++) {
            pos.put(current[i], i);
        }

        // 여기서 이제 Data는 2개 N~F=0 / R~T>2 이렇게 되는거 뜯어서 비교
        for (String cond : data) {
            String a = cond.charAt(0) + "";
            String b = cond.charAt(2) + "";
            char op = cond.charAt(3);
            int dist = cond.charAt(4) - '0';

            // 여기 문자위치끼리 빼서 저거 조건 맞는지 비교
            int gap = Math.abs(pos.get(a) - pos.get(b)) - 1;

            if (op == '=') {
                if (gap != dist) return false;
            } else if (op == '<') {
                if (gap >= dist) return false;
            } else if (op == '>') {
                if (gap <= dist) return false;
            }
        }

        return true;
    }
}
}
