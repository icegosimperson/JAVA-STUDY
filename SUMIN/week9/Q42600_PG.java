package SUMIN.week9;

import java.util.*;
class Q42600_PG {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        //알파벳 조작 횟수
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);
        }
        //커서 이동 최소 거리 구하기
        int move = len - 1; // 일단 한 방향으로만 쭉 가는 경우
        for (int i = 0; i < len; i++) {
            int next = i + 1;
            //A가 연속으로 나오는 부분 찾기
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            //i까지 가고, 끝에서 돌아와서 next 이후로 이동
            move = Math.min(move, i + len - next + Math.min(i, len - next));
            //왼쪽 -> i까지 이동 + 오른쪽 끝 -> next로 이동, 혹은 그 반대
        }
        answer += move;

        return answer;
    }
}