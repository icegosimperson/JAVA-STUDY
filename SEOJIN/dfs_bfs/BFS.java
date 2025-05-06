import java.util.*;

public class BFS {
    public void bfs(List<List<Integer>> graph, int startVertex) {
        //====== 코드 작성 =====

        //시작점 예약하기
        Queue<Integer> queue = new LinkedList<Integer>();
        int N = graph.size();
        boolean[] v = new boolean[N];

        //visited hashmap, array

        queue.add(startVertex);
        v[startVertex] = true;

        while (!queue.isEmpty()){
            //방문
            int curVertex = queue.remove();

            //다음 노드 예약
            for (int vertex : graph.get(curVertex)){
                if (v[vertex] != true){

                }

            }


        }



        //====================
    }

    public void solve(List<List<Integer>> graph) {
        bfs(graph, 0);
    }

    // 실행용 메소드
    public static void main(String[] args) {
        (new BFS()).solve(makeGraph());
    }

    public static List<List<Integer>> makeGraph() {
        return new ArrayList<>() {{
            add(List.of(1, 3, 6));
            add(List.of(0, 3));
            add(List.of(3));
            add(List.of(0, 1, 2, 7));
            add(List.of(5));
            add(List.of(4, 6, 7));
            add(List.of(0, 5));
            add(List.of(3, 5));
        }};
    }

}