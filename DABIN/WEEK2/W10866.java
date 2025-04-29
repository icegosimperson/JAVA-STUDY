package DABIN.WEEK2;

import java.util.*;
import java.io.*;

public class W10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deq = new ArrayDeque<Integer>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push_front":
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.pollLast()).append("\n");
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    if (deq.isEmpty())
                        sb.append(1).append("\n");
                    else
                        sb.append(0).append("\n");
                    break;
                case "front":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekFirst()).append("\n");
                    break;
                case "back":
                    if (deq.isEmpty())
                        sb.append(-1).append("\n");
                    else
                        sb.append(deq.peekLast()).append("\n");
                    break;
                default:
                    break;
            }
        }
    }
}
