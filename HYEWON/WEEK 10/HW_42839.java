import java.util.*;

class HW_42839 {
    private static Set<Integer> set = new HashSet<>();
    private static boolean[] visited;
    private static boolean isPrime(int x){
        if(x==1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    private static void dfs(String numbers, String cur){
        if(!cur.equals("")){
            int n = Integer.parseInt(cur);
            if(n>1 && isPrime(n)){
                set.add(n);
            }
        }
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers, cur+numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        dfs(numbers, "");
        return set.size();

    }


}