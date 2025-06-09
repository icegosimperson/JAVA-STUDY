import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
맞닿은 극이 다르면 B는 A와 반대방향으로 회전
 */
class HW_14891 {
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        arr = new int[4][8];
        for(int i=0; i<4; i++){
            String s = br.readLine();
            for(int j=0; j<8; j++){
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        int K = Integer.parseInt(br.readLine());
        while(K-->0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken())-1; // 회전할 톱니
            int d = Integer.parseInt(st.nextToken()); // 회전 방향
            int[] check = new int[4];
            check[n] = d;

            for(int i=n; i>0; i--){ // 왼쪽 방향
                if(arr[i][6] != arr[i-1][2]){
                    check[i - 1] = -check[i]; // 반대 방향
                } else break;
            }
            for(int i=n; i<3; i++){ // 오른쪽 방향
                if(arr[i][2] != arr[i+1][6]){
                    check[i + 1] = -check[i];
                } else break;
            }
            for(int i=0; i<4; i++){ // 4개 톱니바퀴 확인
                if(check[i] !=0){
                    rotate(i, check[i]);
                }
            }
        }
        int score = 0;
        for(int i=0; i<4; i++){
            if(arr[i][0]==1){
                score += (1 << i); // 1, 2, 4, 8
            }
        }
        System.out.println(score);
    }
    private static void rotate(int idx, int dir){
        if(dir==1){
            int temp = arr[idx][7];
            for(int i=7; i>0; i--){
                arr[idx][i] = arr[idx][i - 1];
            }
            arr[idx][0] = temp;
        } else if(dir==-1){
            int temp = arr[idx][0];
            for(int i=0; i<7; i++){
                arr[idx][i] = arr[idx][i + 1];
            }
            arr[idx][7] = temp;
        }
    }
}
