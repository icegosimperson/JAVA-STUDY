package BOSEONG.WEEK10.BOSEONG;
import java.util.*;
public class BS_여행경로 {

    String[] answer;
    boolean finished = false;

    public String[] solution(String[][] tickets) {
        answer = new String[tickets.length + 1];
        Map<String, List<String>> graph = new HashMap<>();

        // 그래프 구성
        for (String[] s : tickets) {
            String from = s[0];
            String to = s[1];
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
        }

        // 목적지 사전순 정렬
        for (List<String> l : graph.values()) {
            Collections.sort(l);
        }

        List<String> path = new ArrayList<>();
        path.add("ICN");
        dfs("ICN", graph, path, tickets.length);

        return answer;
    }

    void dfs(String current, Map<String, List<String>> graph, List<String> path, int ticketCount) {
        if (finished) return; // 이미 경로를 찾았으면 더 탐색 안 함

        // 경로 완성
        // 길 경로가 티켓 갯수 + 1 이면 끝이여서 바로 answer에 담아서 끝내기
        if (path.size() == ticketCount + 1) {
            for (int i = 0; i < path.size(); i++) {
                answer[i] = path.get(i);
            }
            finished = true;
            return;
        }

        // 출발지 current에서 갈 수 있는 목적지들
        // getOrDefault를 통해서 해당 위치에서 다음 목적지에 대한 값 받기
        List<String> destinations = graph.getOrDefault(current, new ArrayList<>());
        for (int i = 0; i < destinations.size(); i++) {
            String next = destinations.get(i);

            // 사용한 티켓은 잠깐 빼고
            destinations.remove(i);
            path.add(next);
            
            dfs(next, graph, path, ticketCount);

            // 백트래킹
            path.remove(path.size() - 1);
            destinations.add(i, next);
        }
    }
}

