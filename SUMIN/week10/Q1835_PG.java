package SUMIN.week10;
import java.util.*;
public class Q1835_PG {
    class Solution {
        static int answer;
        static char[] friends;
        static String[] dt;
        static boolean[] visited;
        public int solution(int n, String[] data) {
            dt = data;
            answer = 0;
            friends = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
            visited = new boolean[8];

            dfs("", 0);
            return answer;
        }
        static void dfs(String line, int depth) {
            if (depth == 8) { //줄을 다 세웠을 때
                if (check(line)) { //조건을 만족한다면
                    answer++; //answer 증가
                }
            }
            //depth => index(자리), i -> friends
            for (int i = 0; i < 8; i++){
                //아직 줄을 서지 않은 프렌즈라면 세우고 재귀
                if (!visited[i]) {
                    visited[i] = true;
                    dfs(line + friends[i], depth+1);
                    visited[i] = false;
                }
            }
        }
        static boolean check(String line) {
            //"N~F=0", "R~T<2"
            for (String cond : dt) {
                //둘 사이의 거리
                int diff = (Math.abs(line.indexOf(cond.charAt(0)) - line.indexOf(cond.charAt(2)))) - 1;
                char sign = cond.charAt(3);
                int val = cond.charAt(4) - '0';

                if (sign == '=') {
                    if (diff != val) return false;
                }
                else if (sign == '>') {
                    if (diff <= val) return false;
                }
                else {
                    if (diff >= val) return false;
                }
            }
            return true;
        }
    }
}
