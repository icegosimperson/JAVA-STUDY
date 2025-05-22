import java.util.*;
public class Solution
{
    public static int solution(String s)
    {
        int answer = 1;

        Deque<Character> deque = new ArrayDeque<>();

        for(int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (i == 0) {
                deque.offerLast(curr);
            }

            if(deque.isEmpty()) {
                deque.offerLast(curr);
            } else {
                if(deque.peekLast() == curr) {
                    deque.pollLast();
                } else {
                    answer = 0;
                    break;
                }
            }

        }

        if(!deque.isEmpty()) answer = 0;
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.next();
        System.out.println(solution(target));
    }
}