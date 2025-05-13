package BOSEONG.WEEK7.BOSEONG;

import java.io.*;
import java.util.*;

public class BS_21278 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 첫줄 받기
        st= new StringTokenizer(br.readLine());

        // N은 건물 수 M은 도로 수
        int N = Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());
        
        List<int []>[] graph = new ArrayList[N + 1];
        for(int i =1; i < N + 1; i++){
            graph[i] = new ArrayList<>();
        }
        // 왔다갔다 무방향 그래프 만들었음
        for(int j = 0; j < M; j++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(new int[]{b,1});
            graph[b].add(new int[]{a,1});
        }
        

        // 이제 해야하는건 그래프 정점 2개를 선택해서 그때 모든 도시에 대해서 왕복 시간
        
        for(int k = 0; k < N; k++){
            System.out.println(graph[k]);
        }
    }
}
