import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/*
1번 카드가 제일 위에, N번 카드가 제일 아래인 상태 순서로 카드가 있다
제일 위에 있는 카드 -> 버림 / 그 다음 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮긴다
 */
class HW_2164{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1; i<=N; i++){
            queue.add(i);
        }

        while(queue.size()>1){
            queue.poll(); // 제일 위에 있는 카드 -> 버림
            queue.add(queue.poll()); // 그 다음 카드 -> 제일 아래 있는 카드 밑으로
        }
        System.out.println(queue.poll());
    }
}


