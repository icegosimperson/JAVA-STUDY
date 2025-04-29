package SUMIN.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class SOO_Q2164_OPT {
    public static void main(String[] args) throws IOException {
        //큐 선언(Deque 사용)
        Queue<Integer> cardQueue = new ArrayDeque<>();

        //수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());

        //큐에 숫자 삽입
        for (int i = 1; i <= inputNum; i++) {
            cardQueue.add(i);
        }

        //카드 제거 및 뒤로 보내기
        while (cardQueue.size() > 1) {
            //맨 앞에 있는 카드 버리기
            cardQueue.poll();
            //그 뒤에 있는 카드 뒤로 보내기
            cardQueue.add(cardQueue.poll());
        }

        //마지막으로 남은 카드 출력
        System.out.println(cardQueue.poll());
    }
}
