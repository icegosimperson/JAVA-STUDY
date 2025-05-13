package DABIN.WEEK7;

import java.util.*;

public class W1715 {
    public static void main(String[] args) {
        int result=0;
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int a= sc.nextInt();
            queue.offer(a);
        }
        while(!queue.isEmpty()){
            int f=queue.poll();
            if(queue.isEmpty()){
                queue.offer(f);
                break;
            }
                
            int s=queue.poll();
            int sum=f+s;
            result+=sum;
            queue.offer(sum);
        }
        System.out.println(result);
        sc.close();
    }
}
