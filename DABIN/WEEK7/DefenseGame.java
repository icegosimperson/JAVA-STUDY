package DABIN.WEEK7;

public class DefenseGame {
    /*
        import java.util.PriorityQueue;
        import java.util.Collections;

        class Solution {
            public int solution(int n, int k, int[] enemy) {

                PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

                for (int i = 0; i < enemy.length; i++) {
                    n -= enemy[i];     
                    pq.offer(enemy[i]);    

                    if (n < 0) {
                        if (k > 0) {
                        
                            n += pq.poll();
                            k--;
                        } else {
                            return i; 
                        }
                    }
                }

                return enemy.length; 
            }
        }
 
     
     여기까지가 PriorityQ*/

     /*
        class Solution {
            public int solution(int n, int k, int[] enemy) {
                int count=0;
                while(n>0&&count<enemy.length){
                    n-=enemy[count];
                    if(n<0){
                        if(k>0){
                            n+=enemy[count];
                            k--;
                        }
                        else{
                            return count;
                        }
                    }
                    count++;
                }
                int answer = enemy.length;
                return answer;
            }
        }

      */
}
