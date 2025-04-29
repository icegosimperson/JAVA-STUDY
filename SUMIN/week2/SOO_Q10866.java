package SUMIN.week2;

import java.io.*;
import java.util.*;

public class SOO_Q10866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();

            switch(order) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if(!deque.isEmpty()) System.out.println(deque.remove());
                    else System.out.println(-1);
                    break;
                case "pop_back" :
                    if (!deque.isEmpty()) System.out.println(deque.removeLast());
                    else System.out.println(-1);
                    break;
                case "size" :
                    System.out.println(deque.size());
                    break;
                case "empty" :
                    if (!deque.isEmpty()) System.out.println(0);
                    else System.out.println(1);
                    break;
                case "front" :
                    if (!deque.isEmpty()) System.out.println(deque.peek());
                    else System.out.println(-1);
                    break;
                case "back" :
                    if (!deque.isEmpty()) System.out.println(deque.peekLast());
                    else System.out.println(-1);
                    break;
            }
        }
    }
}
