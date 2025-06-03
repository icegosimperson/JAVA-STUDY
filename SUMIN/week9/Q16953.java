package SUMIN.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int answer = 1;

        while(B  != A) {
            //정답보다 찾는 수가 커진다면
            if (B < A) {
                System.out.println(-1);
                return;
            }
            String str = String.valueOf(B);
            //B가 짝수라면
            if ((B % 2) == 0) {
                B /= 2;
            } else if(str.charAt(str.length() - 1) == '1') {
                str = str.substring(0, str.length()-1);
                B = Integer.parseInt(str);
            } else {
                System.out.println(-1);
                return;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
