package SUMIN.week7;

import java.util.*;
import java.io.*;

public class Q19598_2 {
    private static class Meeting implements Comparable<Meeting> {
        int start;
        int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        //시작시간 기준으로 정렬
        @Override
        public int compareTo(Meeting o) {
            return Integer.compare(this.start, o.start);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        //List에 Meeting 저장
        List<Meeting> meetingList = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            meetingList.add(new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        //List 정렬 (시작 시간 기준)
        Collections.sort(meetingList);

        //Priority Queue에 끝나는 시간을 내림차순으로 저장
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Meeting m : meetingList) {
            //이미 끝난 방이 있다면 재사용
            if (!pq.isEmpty() && pq.peek() <= m.start) {
                pq.poll(); //기존 회의 끝났으니 회의실 재사용
            }
            //우선순위 큐에 이 회의의 종료시간 저장
            pq.add(m.end);
        }

        System.out.println(pq.size());
    }
}
