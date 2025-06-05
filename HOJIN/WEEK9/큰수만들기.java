import java.util.*;
class 큰수만들기 {
    public String solution(String number, int k) {
        String answer = "";

        Deque<Character> stack = new ArrayDeque<>();

        for(char c : number.toCharArray()) {
            while(!stack.isEmpty() && k > 0 && stack.peekLast() < c) {
                stack.pollLast();
                k--;
            }
            stack.offerLast(c);
        }

        //만약 아직 숫자를 다 빼지 않았다면, 추가로 삭제
        while(k-- > 0) {
            stack.pollLast();
        }

        for(char c : stack) {
            answer += c;
        }

        return answer;
    }
}