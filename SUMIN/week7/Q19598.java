package SUMIN.week7;

import java.util.*;
import java.io.*;

//3
//        0 40
//        15 30
//        5 10

public class Q19598 {
    private static class Time implements Comparable<Time>{
        int time; //시간(시작일수도 있고 끝나는 시간일수도 있음)
        boolean isStart; // 시작시간인지 확인하기 위한 boolean type 변수

        public Time(int time, boolean isStart) {
            this.time = time;
            this.isStart = isStart;
        }

        @Override
        public int compareTo(Time o) {
            return this.time - o.time;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int rooms = 0;
        int count = 0;
        PriorityQueue<Time> pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++)  {
            st = new StringTokenizer(br.readLine());
            pq.add(new Time(Integer.parseInt(st.nextToken()), true));//start는 true
            pq.add(new Time(Integer.parseInt(st.nextToken()), false)); //end는 false
        }

        while(!pq.isEmpty()) {
            Time time = pq.poll();
            if (time.isStart) { //시작시간이면
                count++;
                rooms = Math.max(count, rooms);
            } else {
                count--;
            }
        }

        System.out.println(rooms);


    }
}
