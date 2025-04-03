import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class HW_10845{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(new StringBuilder());
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        int LastX  = 0; // 가장 마지막 값을 저장하기 위한 원소

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken(); // 입력받는 명령어
            switch(input) {
                case "push":
                    if (st.hasMoreTokens()) {
                        int X = Integer.parseInt(st.nextToken());
                        queue.add(X);
                        LastX = X;
                        break;
                    }
                    break;
                case "pop":
                    if(!queue.isEmpty()){
                        sb.append(queue.poll());
                    } else sb.append(-1);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if(!queue.isEmpty()) sb.append(0);
                    else sb.append(1);
                    sb.append("\n");
                    break;
                case "front":
                    if(!queue.isEmpty()){
                        sb.append(queue.peek());
                    } else sb.append(-1);
                    sb.append("\n");
                    break;
                case "back":
                    if(!queue.isEmpty()){
                        sb.append(LastX);
                    } else sb.append(-1);
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}