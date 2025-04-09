import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class HW_2606{
    static ArrayList<Integer>[] arr;
    static boolean visited[];
    static int cnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int M = Integer.parseInt(br.readLine()); // 연결되어 있는 컴퓨터 쌍의 수

        // 그래프로 연결 받기
        arr = new ArrayList[N+1];
        visited = new boolean[N + 1];
        for(int i=1; i<N+1; i++){
            arr[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        dfs(1);
        bw.write(String.valueOf(cnt-1));
        bw.flush();
        br.close();
    }
    private static void dfs(int depth){
        visited[depth] = true;
        cnt++;
        for(int i:arr[depth]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }
}