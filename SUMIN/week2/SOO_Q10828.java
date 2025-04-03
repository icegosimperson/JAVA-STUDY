package SUMIN.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

public class SOO_Q10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력받는 명령어 수
        int num = Integer.parseInt(br.readLine());

        //stack 선언
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch (order) {
                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(stack.size());
                    break;
                case "empty" :
                    if (!stack.isEmpty()) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case "top" :
                    if (!stack.isEmpty()) {
                        System.out.println(stack.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }


        }
    }
}
