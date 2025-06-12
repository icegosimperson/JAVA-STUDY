import java.util.*;
class HW_43164 {
    static ArrayList<String> list = new ArrayList<>();
    static boolean[] visited;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        dfs(0, "ICN", "ICN", tickets);
        Collections.sort(list);
        return list.get(0).split(" ");
    }
    private static void dfs(int depth, String cur, String route, String[][] tickets){
        if(depth==tickets.length){
            list.add(route);
            return;
        }
        for(int i=0; i<visited.length; i++){
            if(!visited[i] && cur.equals(tickets[i][0])){
                visited[i] = true;
                dfs(depth+1, tickets[i][1], route + " "+tickets[i][1], tickets);
                visited[i] = false;
            }
        }
    }
}