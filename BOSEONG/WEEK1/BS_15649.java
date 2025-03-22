import java.util.Scanner;

class BS_15649 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 3
        int m = sc.nextInt(); // 1
        int output[] = new int[n]; // 여기는 출력 값 저장 후 내보내는 용도도
        boolean visited[] = new boolean[n]; // 일단 3개면 방문 했는지 안했는지에 대한 배열을 만들거임
        
        permutation(output,visited,0,n,m);
    }

    public static void permutation(int output[], boolean visited[], int depth, int len, int r){
        if(depth == r){ // 우리는 r자리만큼의 숫자만 뽑으면 되니까 되면 바로 내보내기기
            for(int i =0; i<r; i ++){
                System.out.print(output[i]+" ");
            }
            System.out.println();
        }
        // 여기서 이제 vistied 안되어있는 친구들만 출력값에 저장
        for(int i =0; i<len; i++){
            if(!visited[i]){
                visited[i] = true;
                output[depth]= i+1;
                permutation(output, visited, depth+1, len, r);// 깊이 + 1로 바꾸는 이유는 지금 한번 했으니까 다음 2번째 자리까지 찾기 위해서임! 
                // 함수 탈출하면 다시 안들어간걸로 바꾸기
                visited[i]=false;
            }
        }
    }
}
