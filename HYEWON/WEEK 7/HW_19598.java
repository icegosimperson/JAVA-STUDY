import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
최소 회의실 개수 구하기

 */
class HW_19598{
    static class Node implements Comparable<Node>{
        int s, e;
        public Node(int s, int e){
            this.s = s;
            this.e = e;
        }
        @Override
        public int compareTo(Node o){
            return this.s - o.s; // 시작 시간 기준 오름차순 정렬
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); // 회의 시작 시간
            int e = Integer.parseInt(st.nextToken()); // 회의 끝나는 시간
            nodes[i] = new Node(s, e);
        }
        Arrays.sort(nodes);

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 종료 시간 기준
        pq.offer(nodes[0].e);

        for(int i=1; i<N; i++){
            if(pq.peek() <= nodes[i].s){
                pq.poll();
            }
            pq.offer(nodes[i].e);
        }
        System.out.println(pq.size());

    }
}