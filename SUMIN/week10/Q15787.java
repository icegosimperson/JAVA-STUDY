package SUMIN.week10;

import java.util.*;
import java.io.*;
public class Q15787 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trains = new int[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int index = Integer.parseInt(st.nextToken());

            if (cmd == 1) {
                int x = Integer.parseInt(st.nextToken());
                trains[index] |= (1 << (x - 1)); // x번째 좌석에 사람 태움 (비트 ON)
            } else if (cmd == 2) {
                int x = Integer.parseInt(st.nextToken());
                trains[index] &= ~(1 << (x - 1)); // x번째 좌석에 사람 내림 (비트 OFF)
            } else if (cmd == 3) {
                // 뒤로 한칸 shift (좌석 오른쪽으로 이동), 20번 좌석은 버림
                trains[index] <<= 1;
                trains[index] &= ~(1 << 20); // 21번째 비트는 항상 0이어야 함
            } else if (cmd == 4) {
                // 앞으로 한칸 shift (좌석 왼쪽으로 이동), 1번 좌석은 버림
                trains[index] >>= 1;
            }
        }
        // 중복 없이 상태 저장
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set.add(trains[i]);
        }

        System.out.println(set.size());
    }
}
