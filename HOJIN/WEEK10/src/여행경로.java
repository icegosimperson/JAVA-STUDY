import java.util.*;
class 여행경로 {
    private static List<String> path = new ArrayList<>();
    private static boolean[] used;
    private static String[] answer;
    private static List<String> result;

    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length + 1];
        Arrays.sort(tickets, new Comparator<String[]>() {
            public int compare(String[] s1, String[] s2) {
                if(s1[0].equals(s2[0])) {
                    return s1[1].compareTo(s2[1]);
                }
                return s1[0].compareTo(s2[0]);
            }
        });

        used = new boolean[tickets.length];
        path.add("ICN");
        dfs("ICN", tickets, 0);
        for(int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    private void dfs(String curr, String[][] tickets, int depth) {
        if(depth == tickets.length) {
            result = new ArrayList<>(path);
            return;
        }

        for (int i = 0; i < tickets.length; i++) {
            if (!used[i] && tickets[i][0].equals(curr)) {
                used[i] = true;
                path.add(tickets[i][1]);
                dfs(tickets[i][1], tickets, depth + 1);
                if(result != null) return;
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}