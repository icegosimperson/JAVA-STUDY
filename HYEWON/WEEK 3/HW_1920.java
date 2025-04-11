import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 시간 복잡도 : N=100,000, O(N^2) 불가
// O(100,000 log100,000) = O(M logN)
// 사용할 자료구조 : 이분 탐색
class HW_1920{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            int target = Integer.parseInt(st.nextToken()); // M 값들 입력 받음
            int s = 0; // start
            int e = N-1; // end
            boolean check = false; // 같은값을 찾는 변수
            while(s<=e){
                int mid = (s+e)/2;
                int midIndex = arr[mid];
                if(target < midIndex){
                    e = mid-1;
                } else if(midIndex < target){
                    s = mid+1;
                } else {
                    check = true;
                    break;
                }
            }
            if(check) sb.append(1).append("\n");
            else sb.append(0).append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        br.close();
    }
}