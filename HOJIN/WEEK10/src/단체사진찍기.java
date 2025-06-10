import java.util.*;
class 단체사진찍기 {
    static char[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static boolean[] visited;
    static String[] states;
    static int answer;

    public int solution(int n, String[] data) {
        answer = 0;
        states = data;
        visited = new boolean[8];
        dfs(0, new char[8]);
        return answer;
    }

    private void dfs(int depth, char[] order) {
        if (depth == 8) {
            if(isValid(order)) {
                answer++;
                return;
            }
        }

        for(int i = 0; i < 8; i++) {
            if(!visited[i]) {
                visited[i] = true;
                order[depth] = friends[i];
                dfs(depth + 1, order);
                visited[i] = false;
            }
        }
    }

    private boolean isValid(char[] order) {
        Map<Character, Integer> pos = new HashMap<>();
        for(int i = 0; i < order.length; i++) {
            pos.put(order[i], i);
        }

        for(String s : states) {
            char a = s.charAt(0);
            char b = s.charAt(2);
            char op = s.charAt(3);
            int targetDist = Character.getNumericValue(s.charAt(4));

            int dist = Math.abs(pos.get(a) - pos.get(b)) - 1;

            if(op == '=' && dist != targetDist) return false;
            if(op == '>' && dist <= targetDist) return false;
            if(op == '<' && dist >= targetDist) return false;

        }

        return true;
    }
}