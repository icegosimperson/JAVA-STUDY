package SUMIN.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SOO_Q10845 {
    public static void main(String[] args) throws IOException {
//        push X: 정수 X를 큐에 넣는 연산이다.
//        pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        size: 큐에 들어있는 정수의 개수를 출력한다.
//        empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//        front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //입력받을 명령어 개수 입력받아 저장
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;

        //디큐 선언
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push" :
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!deque.isEmpty()) {
                        System.out.println(deque.remove());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    if (!deque.isEmpty()) {
                        System.out.println(0);
                    } else {
                        System.out.println(1);
                    }
                    break;
                case "front" :
                    if (!deque.isEmpty()) {
                        System.out.println(deque.peek());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                case "back" :
                    if (!deque.isEmpty()) {
                        System.out.println(deque.peekLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;
            }
        }
    }
}
