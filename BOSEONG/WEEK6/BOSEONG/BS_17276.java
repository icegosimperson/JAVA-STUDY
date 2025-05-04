package BOSEONG.WEEK6.BOSEONG;

import java.util.*;
import java.io.*;

public class BS_17276 {
    public static void main(String[] args) throws IOException{
        // 배열 돌리기
        // n 은 무조건 홀수
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // test_case
        int test_case =  Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
        
        for (int i = 0; i < test_case; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int angle = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++){
                    arr[j][k] = Integer.parseInt(st.nextToken());
                }
            }
            // 여기까지가 한 배열에 대해서 크기, 각도, 배열 값 처리

            // 이제 여기서부터  
        }

    }
}
