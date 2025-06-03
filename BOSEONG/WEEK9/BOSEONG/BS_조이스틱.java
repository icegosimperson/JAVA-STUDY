package BOSEONG.WEEK9.BOSEONG;

public class BS_조이스틱 {
    class Solution {
        public int solution(String name) {
            int answer = 0;
            int len = name.length();
            int move = len - 1;
    
            for (int i = 0; i < len; i++) {
                char c = name.charAt(i);
                answer += Math.min(c - 'A', 'Z' - c + 1);
    
                int next = i + 1;
                while (next < len && name.charAt(next) == 'A') {
                    next++;
                }
    
                int case1 = i + i + len - next; // 오른쪽 → 왼쪽
                int case2 = (len - next) * 2 + i; // 왼쪽 → 오른쪽
    
                move = Math.min(move, Math.min(case1, case2));
            }
    
            return answer + move;
        }
    }
}
