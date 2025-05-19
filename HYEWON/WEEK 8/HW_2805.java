import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 절단기에 설정할 수 있는 높이의 최댓값을 구하기
// Upper Bound
class HW_2805{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 나무의 수
        int M = Integer.parseInt(st.nextToken()); // 나무의 길이

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start = 1, end = arr[N-1]+1;
        while(start < end){
            int mid = (start+end)/2;
            long sum = 0;
            // 잘려나간 나무들의 합
            for(int i=0; i<N; i++){
                if(arr[i] > mid){
                    sum += arr[i]-mid;
                }
            }
            if(sum >=M){
                start = mid+1;
            } else {
                end = mid;
            }
        }
        System.out.println(start-1);
    }
}