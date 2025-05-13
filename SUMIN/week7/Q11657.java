package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q11657 {

    private static class Bus {
        int startCity;
        int endCity;
        int time;

        public Bus(int startCity, int endCity, int time) {
            this.startCity = startCity;
            this.endCity = endCity;
            this.time = time;
        }
    }
    static ArrayList<Bus> graph;
    static final int INF = Integer.MAX_VALUE;

    public static boolean BellmanFord(int n, int m, int start) {
        //모든 정점까지 최소비용을 INF값으로 초기화
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int cityCnt = Integer.parseInt(st.nextToken());
        int busNodeCnt = Integer.parseInt(st.nextToken());

        graph = new ArrayList<>(busNodeCnt);
        for (int i = 0; i < busNodeCnt; i++) {
            st = new StringTokenizer(br.readLine());
            graph.add(new Bus(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        System.out.println(BellmanFord(cityCnt, busNodeCnt, 1));

    }
}
