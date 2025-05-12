package BOSEONG.WEEK7.BOSEONG;

import java.io.*;
import java.util.*;

public class BS_10282 {
    // 해킹//
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        // 2
        int test_case = Integer.parseInt(st.nextToken());
        int n = 0, d = 0, c = 0, a = 0, b = 0, s = 0, h_n = 0, h_s = 0;
        // n 컴퓨터 개수, d 의존성 개수, c 해킹당한 컴퓨터 번호
        // a 컴퓨터 -> b 의존 / b 감염되면 s 초 후에 a도 감염 
        // h_n은 해킹당한 컴터 개수, h_s 는 총 감염시간
        // 해킹당한 컴퓨터까지 포함하여 총 몇 대의 컴퓨터가 감염되며 
        // 그에 걸리는 시간이 얼마인지 구하는 프로그램을 작성하시오
        for(int i = 0; i < test_case; i++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            // 3 2 2 
            for(int j = 0; j < d; j++){
                st= new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                s = Integer.parseInt(st.nextToken());
                // 2 1 5
                // 3 2 5

                
            }
        }
    }
}
