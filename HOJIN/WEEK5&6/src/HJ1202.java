import java.io.*;
import java.util.*;

public class HJ1202 {

    static class Jewel{
        int weight;
        int price;
        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //보석의 무게 순 우선순위큐
        PriorityQueue<Jewel> jewels = new PriorityQueue<Jewel>(new Comparator<Jewel>() {
            @Override
            public int compare(Jewel a, Jewel b) {
                return a.weight - b.weight;
            }
        });

        //보석정보 입력
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());
            jewels.offer(new Jewel(weight, price));
        }

        //가방정보 입력
        int[] bags = new int[K];
        for(int i = 0; i < K; i++) {
            bags[i] = Integer.parseInt(br.readLine());
        }
        //가방배열 오름차순 정렬
        Arrays.sort(bags);

        //각 가방의 최대 무게를 저장할 우선순위큐
        PriorityQueue<Integer> maxPrice = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        long totalPrice = 0; //변수범위 신경 잘쓰기...

        for (int bag : bags) {
            while(!jewels.isEmpty() && jewels.peek().weight <= bag) {
                maxPrice.offer(jewels.poll().price);
            }

            if(!maxPrice.isEmpty()) {
                totalPrice += maxPrice.poll(); //현재 상태에서 가장 비싼 보석
            }
        }

        br.close();
        bw.write(String.valueOf(totalPrice));
        bw.flush();
        bw.close();
    }
}