package BOSEONG.WEEK5.BOSEONG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BS_1074 {
    public static void main(String[] args) throws IOException{
        ///첫째 줄에 정수 N, r, c가 주어진다.
        //r행 c열을 몇 번째로 방문했는지 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());


        // N이 1일 때, 
        // 0,0 0,1 1,0 1,1 -> (n - 1, n - 1) (n - 1, n - 0) 
    
        // n이 2일떄,
        // 0,0 0,1 1,0 1,1 -> 
    }
}
