import java.util.*;
class HW_142085 {
    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 지금까지 만난 적의 병력 수 저장
        int ans = 0;
        for(int i=0; i<enemy.length; i++){
            n-= enemy[i];
            pq.offer(enemy[i]);
            if(n<0){
                if(k>0 && !pq.isEmpty()){
                    n += pq.poll(); // 다시 더해 주고
                    k--; // 무적권 사용
                } else break;
            }
            ans++; // 라운드 버팀
        }
        return ans;
    }
}