package SUMIN.week6;

import java.util.*;
import java.io.*;
//보석 도둑
//상덕이가 훔칠 수 있는 보석 갸격의 합의 최댓값 출력
//가방에 최대 한 개의 보석만 넣을 수 있음
public class Q1202_Arr {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //보석 개수
        int K = Integer.parseInt(st.nextToken());  // 가지고 있는 가방 개수
        int totalPrice = 0;
        int[][] jewelInfo = new int[N][2];
        int[] bag = new int[K];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            jewelInfo[i][0] = Integer.parseInt(st.nextToken());
            jewelInfo[i][1] = Integer.parseInt(st.nextToken());
        }

        // 가방에 담을 수 있는 최대 무게 배열에 저장
        for (int j = 0; j < K; j++) {
            bag[j] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(jewelInfo, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                //첫번 째 원소의 값이 같을 때 두번 째 원소의 값을 기준으로 정렬
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                //같지 않을 경우 첫번쨰 원소를 기준으로 정렬
                else return o1[0] - o2[0];
            }
        });

        //가방 무게보다 제한보다 작은 보석들 중에서 제일 가격이 비싼애들을 담아주면 됨!
        for (int i = 0; i < bag.length; i++) {
            int weight = bag[i];
            int maxPrice = 0;
            int selectedIndex = -1;

            for (int j = 0; j < N; j++) {
                if (!visited[j] && jewelInfo[j][0] <= weight) {
                    if (jewelInfo[j][1] > maxPrice) {
                        maxPrice = jewelInfo[j][1];
                        selectedIndex = j;
                    }
                }
            }

            if (selectedIndex != -1) {
                visited[selectedIndex] = true;
                totalPrice += maxPrice;
            }
        }

        System.out.println(totalPrice);

    }
}
