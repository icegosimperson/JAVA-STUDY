import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

// 0이 주어진 횟수 만큼 답을 출력한다
// 만약 배열이 비어있는 경우인데, 가장 작은 값을 출력하라고 한 경우 0을 출력
class HW_1927{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(pq.isEmpty()){
                    System.out.println("0");
                } else{ // 0이 주어진 횟수 만큼 답을 출력
                    System.out.println(pq.poll());
                }
            } else{
                pq.add(x);
            }
        }
    }
}