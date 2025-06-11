class HW_1835 {
    private static String friends = "ACFJMNRT";
    private static final int length = friends.length();
    private static boolean[] visited = new boolean[length];
    private static int[] position = new int[length];
    private static String[] datas;
    private static int answer;
    public int solution(int n, String[] data) {
        answer = 0;
        datas = data; // copy
        dfs(0);
        return answer;
    }
    private static void dfs(int depth){
        if(depth==length){
            if(check()) answer++;
        }
        else{
            for(int i=0; i<length; i++){
                if(!visited[i]){
                    visited[i] = true;
                    position[i] = depth;
                    dfs(depth+1);
                    visited[i] = false;
                }
            }
        }
    }
    private static boolean check(){
        for(String d : datas){
            int a = friends.indexOf(d.charAt(0));
            int b = friends.indexOf(d.charAt(2));
            char op = d.charAt(3);
            int num = d.charAt(4)-'0';

            int dist = Math.abs(position[a] - position[b])-1;
            if(op=='=' && dist != num) return false;
            else if(op=='>' && dist <= num) return false;
            else if(op=='<' && dist >= num) return false;

        }
        return true;
    }
}