import java.io.*;
import java.util.*;

public class HJ2110 {
    private static int N, C;
    private static int[] houses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        //집의 위치 입력
        houses = new int[N];
        for(int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(houses); //오름차순으로 정렬

        long start = 1;
        long end = houses[N - 1] - houses[0]; //최대 간격

        while(start <= end) {
            long mid = (start + end) / 2;

            long cnt = 1; //첫번째 집에는 설치
            long last = houses[0];

            for(int i = 1; i < N; i++) { //200000번 돌릴수도
                if(houses[i] - last >= mid) {
                    cnt++;
                    last = houses[i];
                }
            }

            if(C <= cnt) { //집 간격 넓혀야함 -> upperbound 규칙
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        br.close();
        bw.write(String.valueOf(start - 1));
        bw.flush();
        bw.close();
    }
}
