import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class HW_1477{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+2];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr[N+1] = L;
        Arrays.sort(arr);
        int start = 1, end = L;
        while(start < end){
            int mid = (start+end)/2; // 구간의 최대 길이
            int cnt  = 0;
            for(int i=1; i<arr.length; i++){
                int temp = arr[i] - arr[i-1]; // 두 휴게소 사이의 거리
                cnt += (temp-1) / mid;
            }
            if(M < cnt){
                start = mid+1;
            } else end = mid;
        }
        System.out.println(start);
    }
}