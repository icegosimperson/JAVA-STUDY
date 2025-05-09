import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException
    {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//        for(int i = 1; i <= 5; i++) {
//            maxHeap.offer(i);
//        }

        minHeap.offer(3);
        minHeap.offer(1);
        minHeap.offer(4);
        minHeap.offer(2);
        minHeap.offer(5);

        while(!minHeap.isEmpty()) {
            int head = minHeap.poll();
            System.out.println(head);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b - a;
            }
        });

        maxHeap.offer(1);
        maxHeap.offer(2);
        maxHeap.offer(3);

        while(!maxHeap.isEmpty()){
            System.out.println((int)maxHeap.poll());
        }
    }
}