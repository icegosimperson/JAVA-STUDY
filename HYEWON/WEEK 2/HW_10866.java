import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class HW_10866{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input){
                case "push_front":
                    if(st.hasMoreTokens()){
                        int X = Integer.parseInt(st.nextToken());
                        deque.addFirst(X);
                    }
                    break;
                case "push_back":
                    if (st.hasMoreTokens()) {
                        int X = Integer.parseInt(st.nextToken());
                        deque.addLast(X);
                    }
                    break;
                case "pop_front":
                    if(!deque.isEmpty()) sb.append(deque.pollFirst());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "pop_back":
                    if(!deque.isEmpty()) sb.append(deque.pollLast());
                    else sb.append(-1);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    if(deque.isEmpty()) sb.append("1");
                    else sb.append("0");
                    sb.append("\n");
                    break;
                case "front":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekFirst());
                    } else sb.append("-1");
                    sb.append("\n");
                    break;
                case "back":
                    if(!deque.isEmpty()){
                        sb.append(deque.peekLast());
                    } else sb.append("-1");
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}