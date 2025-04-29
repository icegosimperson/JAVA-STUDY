import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SJ_2164 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        for (int i = 0; i < N; i++) {
            if (q.size() == 1){
                break;
            }
            q.poll();
            int item = q.poll();
            q.add(item);
        }

        System.out.println(q.peek());
    }

}
