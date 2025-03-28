package BOSEONG;
import java.util.*;
import java.io.*;

public class BS_10845 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;
    // 모든 숫자 출력에 대한 것을 여기서 처리하도록 함수 빼기
    public static void printNum(int num) throws IOException{
        bw.write(num + "\n");
    }
    
    public static void main(String args[]) throws IOException{
        Queue<Integer> queue = new LinkedList<>();

        int count_num = Integer.parseInt(br.readLine());

        for (int i =0; i<count_num; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){

            }
            else if(command.equals("pop")){
                if(!queue.isEmpty()) printNum(queue.poll());
                else printNum(-1);
            }
            else if(command.equals("size")){

            } else if(command.equals("empty")){
                if(!queue.isEmpty()) printNum(1);
                else printNum(0);

            } else if(command.equals("front")){
                if(!queue.isEmpty()) printNum(queue.poll());
                else printNum(-1);

            } else if(command.equals("back")){
                if(!queue.isEmpty()) printNum(queue.poll());
                else printNum(-1);

            }
        }
    }
}
