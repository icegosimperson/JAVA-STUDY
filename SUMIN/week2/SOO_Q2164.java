package SUMIN.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SOO_Q2164 {
    public static void main(String[] args) throws IOException {
        //큐 선언
        Queue<Integer> cardQueue = new LinkedList<>();
        //수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int inputNum = Integer.parseInt(st.nextToken());

        //큐에 차례대로 숫자 삽입
        //배열의 index는 0부터 시작하지만 숫자는 1부터 넣어야 하므로 +1해서 삽입
        for (int i = 0; i < inputNum; i++) {
            cardQueue.add(i+1);
        }

        //큐는 데이터가 빠져나가면 그 뒤에 있는 데이터가 제일 앞으로 오게 됨, 그래서 사이즈를 변수에 미리 담아두고 고정된 크기만큼 순회
        int queueSize = cardQueue.size();
        //뒤로 이동시킬 숫자 담는 변수 선언
        int goBackNum;
        for (int j = 0; j < queueSize - 1; j++) {
            //제일 위에 있는 수 삭제
            cardQueue.remove();
            //그 다음 위에 있는 수 삭제 후 변수에 저장
            goBackNum = cardQueue.remove();
            //변수에 저장된 수 다시 큐에 저장
            cardQueue.add(goBackNum);
        }
        //큐에 담긴 마지막 숫자 출력
        System.out.println(cardQueue.peek());
    }
}
