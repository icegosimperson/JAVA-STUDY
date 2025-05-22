import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 만들 수 있는 최대 랜선의 길이 출력
class HW_1654{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); // 이미 가지고 있는 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선의 개수
        long[] arr = new long[K];
        for(int i=0; i<K; i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        Arrays.sort(arr);
        long start =1;
        long end = arr[K-1]+1; // 경계값 포함되기 위해 +1
        while(start < end){
            long mid = (start + end)/2;
            long cnt = 0;
            for(int i=0; i<K; i++){
                cnt += arr[i]/mid;
            }
            if(cnt >= N){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(start-1);

    }
}