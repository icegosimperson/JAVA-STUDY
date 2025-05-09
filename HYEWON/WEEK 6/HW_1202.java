import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 상덕이가 훔칠 수 있는 보석의 최대 가격을 구하는 프로그램
class HW_1202 {
    static class Node implements Comparable<Node> { // pq에 여러 값을 넣고 정렬 기준을 지정하기 위함
        int weight;
        int price;
        public Node(int weight, int price){
            this.weight = weight;
            this.price = price;
        }
        @Override
        public int compareTo(Node o){ // 가격 기준 내림 차순
            return o.price - this.price;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        PriorityQueue<Node> pq = new PriorityQueue<>();

        int N = Integer.parseInt(st.nextToken()); // 보석의 개수
        int K = Integer.parseInt(st.nextToken()); // 상덕이가 가진 가방의 개수

        Node[] arr = new Node[N]; // 보석 무게 제한 떄문에 선언한 노드 객체 배열
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int Mi = Integer.parseInt(st.nextToken()); // 보석의 무게
            int Vi = Integer.parseInt(st.nextToken()); // 보석의 가격
            arr[i] = new Node(Mi, Vi); // 가방 무게 제한이 있기 떄문에 보석 무게 기준으로 필터링 해야 함 바로 pq.add(X)
        }
        Arrays.sort(arr, (o1, o2) -> o1.weight - o2.weight); // 보석 무게 기준으로 정렬

        int[] bag = new int[K];
        for(int i=0; i<K; i++){
            bag[i] = Integer.parseInt(br.readLine()); //  가방에 담을 수 있는 최대 무게
        } // 가방에는 최대 한개 보석만 넣을 수 있음
        Arrays.sort(bag); // 가방 무게를 오름차순으로 하여, 작은 무게 가방부터 값 비싼 보석을 넣어줌

        // 가방 무게 기준으로 보석을 pq에 골라 담아야함
        int idx = 0;
        long total = 0;

        for(int i=0; i<K; i++){
            int cur = bag[i];
            while(idx < N && arr[idx].weight <= cur){ // 현재 가방에 담을 수 있는 보석들을
                pq.add(arr[idx++]); // 우선순위 큐에 넣음
            }
            if(!pq.isEmpty()){
                total += pq.poll().price; // 넣은 보석들의 가격을 더함
            }
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();
    }
}