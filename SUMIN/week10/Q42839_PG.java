package SUMIN.week10;
import java.util.*;
public class Q42839_PG {
    class Solution {
        static ArrayList<Integer> arr = new ArrayList<>();
        static boolean[] visited = new boolean[7];
        public int solution(String numbers) {
            int answer = 0;
            for (int i = 0; i < numbers.length(); i++) {
                dfs(numbers, "", i+1);
            }

            for (int i = 0; i < arr.size(); i++) {
                if (prime(arr.get(i))) { //arr에 소수가 있는지 전체 확인
                    answer++;
                }
            }
            return answer;
        }
        static void dfs(String str, String temp, int m) {
            if (temp.length() == m) {
                int num = Integer.parseInt(temp);
                if (!arr.contains(num)) {
                    arr.add(num);
                }
            }
            for (int i = 0; i < str.length(); i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    temp += str.charAt(i);
                    dfs(str, temp, m);
                    visited[i] = false;
                    temp = temp.substring(0, temp.length()-1);
                }
            }
        }
        static boolean prime(int n) {
            if (n < 2) {
                return false;
            }
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
