package SUMIN.week6;

import java.util.*;
import java.io.*;

//보석 도둑
//상덕이가 훔칠 수 있는 보석 갸격의 합의 최댓값 출력
//가방에 최대 한 개의 보석만 넣을 수 있음
public class Q1202_Queue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //보석 개수
        int K = Integer.parseInt(st.nextToken());  // 가지고 있는 가방 개수
        long totalPrice = 0;
        int[] bag = new int[K];

        //우선순위 큐 이용해서
        List<Jewelry> jewelryList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            jewelryList.add(new Jewelry(m, v));
        }


        // 가방에 담을 수 있는 최대 무게 배열에 저장
        for (int j = 0; j < K; j++) {
            bag[j] = Integer.parseInt(br.readLine());
        }
        //가방 무게 오름차순으로 정렬
        Arrays.sort(bag);
        //보석 무게 오름차순으로 정렬
        Collections.sort(jewelryList);

        Queue<Integer> pq = new PriorityQueue<>((o1,o2) -> (o2-o1));
        int index = 0;
        for (int i = 0; i < K; i++) {
            while(index < N && jewelryList.get(index).m <= bag[i]) {
                pq.add(jewelryList.get(index).v);
                index++;
            }
            //최소 힙 맨 앞에 있는 숫자를 꺼내줌(가장 비싼 보석)
            if (!pq.isEmpty()) {
                totalPrice += pq.poll();
            }
        }
        System.out.println(totalPrice);

    }

    static class Jewelry implements Comparable<Jewelry> {
        int m;
        int v;

        public Jewelry(int m, int v) {
            this.v = v;
            this.m = m;
        }

        @Override
        public int compareTo(Jewelry o) {
            return this.m - o.m;
        }
    }
}
