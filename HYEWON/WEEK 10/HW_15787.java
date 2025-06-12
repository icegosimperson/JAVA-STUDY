import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*
은하수를 건널 수 있는 기차의 수를 출력
 */
class HW_15787{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 기차의 수
        int M = Integer.parseInt(st.nextToken()); // 명령의 수
        int[] train = new int[N + 1];
        while(M-->0){
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());

            if(cmd==1){
                int x = Integer.parseInt(st.nextToken());
                train[i] |= (1 << (x - 1)); // zero-index
            } else if(cmd==2){
                int x = Integer.parseInt(st.nextToken());
                train[i] &= ~(1 << (x - 1));
            } else if(cmd==3){
                train[i] <<= 1;
                train[i] &= (1 << 20) - 1; // 21번째 비트 제거
            } else if(cmd==4){
                train[i]>>=1;
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=1; i<=N; i++){
            set.add(train[i]);
        }
        System.out.println(set.size());
    }
}