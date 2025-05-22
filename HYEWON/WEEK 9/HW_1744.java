import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
-1, 1, 2, 3
음수는 음수끼리 곱하기
0은 곱하지 않고 더해주기
 */
class HW_1744{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> plus = new PriorityQueue<>(Collections.reverseOrder()); // 양수
        PriorityQueue<Integer> minus = new PriorityQueue<>(); // 음수
        // 0은 어디 저장하지?
        int oneCnt =0;
        int zeroCnt =0;
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            if(n>1){
                plus.add(n);
            } else if(n==1){
                oneCnt++;
            } else if(n==0){
                zeroCnt++;
            } else{
                minus.add(n);
            }
        }
        int ans = 0;
        ans += oneCnt; // 1은 그냥 더해줌

        while(plus.size()>1){
            int a = plus.poll();
            int b = plus.poll();
            ans += a*b;
        }
        if(!plus.isEmpty()){
            ans += plus.poll(); // 남은 1개는 그냥 더해줌
        }
        while(minus.size()>1){
            int a = minus.poll();
            int b = minus.poll();
            ans += a*b; // 음수끼리 곱해서 양수 만들어줌
        }
        if(!minus.isEmpty()){ // 음수가 하나 남은 경우
            if(zeroCnt==0){ // 0이 없으면 그냥 더해주기
                ans += minus.poll();
            }
            else{ // 0이 있을 경우, 0이랑 곱해주면 0이 되기 때문에 그냥 poll
                minus.poll();
            }
        }
        System.out.println(ans);
    }
}