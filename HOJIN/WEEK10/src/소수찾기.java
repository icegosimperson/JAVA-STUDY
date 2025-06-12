import java.util.*;
class 소수찾기 {
    private static boolean[] visited;
    private static int cnt, N;
    private static Set<Integer> numSet = new HashSet<>();
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        if(num == 2) return true;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
    public int solution(String numbers) {
        int answer = 0;

        N = numbers.length();
        cnt = 0;
        visited = new boolean[N];

        dfs("", 0, numbers);

        for(int i : numSet) {
            if(isPrime(i)) answer++;
        }

        return answer;
    }

    private static void dfs(String curr, int depth, String numbers) {
        if(!curr.equals("")) {
            numSet.add(Integer.parseInt(curr));
        }



        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(curr + numbers.charAt(i), depth + 1, numbers);
                visited[i] = false;
            }
        }

    }
}