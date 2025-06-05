import java.util.*;

// 조이스틱 조작 횟수의 최솟값 출력
class HW_42860 {
    public int solution(String name) {
        int answer = 0;

        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            answer += Math.min(c-'A', 'Z'-c+1);
        }

        int mv = name.length()-1; // 오른쪽으로 끝까지 가는 경우
        for(int i=0; i<name.length(); i++){
            int next = i+1;
            while(next<name.length() && name.charAt(next)=='A'){
                next++;
            }
            mv = Math.min(mv, i+i+(name.length()-next));
            mv = Math.min(mv, i+2 * (name.length()-next));
        }
        return answer+mv;
    }
}