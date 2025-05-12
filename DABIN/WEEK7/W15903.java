package DABIN.WEEK7;

import java.util.*;

public class W15903 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            queue.offer(a);
        }
        for(int i=0;i<m;i++){
            int sum=0;
            int j=0;
            while(j<2){
                sum+=queue.poll();
                j++;
            }
            queue.offer(sum);
            queue.offer(sum);
        }
        while(!queue.isEmpty()){
            result+=queue.poll();
        }

        System.out.println(result);
        sc.close();
    }
}
