import java.io.*;
import java.util.*;

class HW_1260{
    static int N, M, V;
    static ArrayList<Integer>[] arr;
    static boolean[] visited;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); // 정점의 개수
        M = Integer.parseInt(st.nextToken()); // 간선의 개수
        V = Integer.parseInt(st.nextToken()); // 탐색 시작할 정점의 번호

        arr = new ArrayList[N+1];

        for(int i=1; i<N+1; i++){
            arr[i] = new ArrayList<>();
        }


        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i=1; i<N+1; i++){
            Collections.sort(arr[i]);
        }
        visited = new boolean[N + 1];
        dfs(V);
        bw.write("\n");

        visited = new boolean[N + 1];
        bfs(V);
        bw.write("\n");

        bw.flush();
        bw.close();
    }
    private static void dfs(int v) throws IOException{
        visited[v] = true;
        bw.write(v + " ");
        for(int i : arr[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
    private static void bfs(int v) throws IOException{
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            bw.write(cur + " ");
            for(int i : arr[cur]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}