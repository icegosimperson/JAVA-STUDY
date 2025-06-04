package SUMIN.week8;

import java.util.*;
import java.io.*;

public class Q2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //집의 개수
        int C = Integer.parseInt(st.nextToken()); //공유기의 개수
        int[] house = new int[N];

        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(house);

        int low = 1; //가능한 최소 간격
        int high = house[N-1]; //입력받은 집들의 최대 간격

        while (low <= high) { //Upper bound
            int mid = (low + high) / 2;

            int startPosition = 0; //공유기 설치 시작하는 집의 좌표 (처음부터 시작)
            int count = 1; //첫 집에 확정적으로 하나 설치

            for (int i = 0; i < N; i++) {
                if (house[i] - house[startPosition] >= mid) {
                    startPosition = i;
                    count++;
                }
            }

            if (count < C) {
                high = mid - 1;
                continue;
            }

            low = mid + 1;
        }

        System.out.println(low-1);
    }

}
