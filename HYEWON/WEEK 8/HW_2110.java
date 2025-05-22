import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class HW_2110{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 집의 개ㅔ수
        int C = Integer.parseInt(st.nextToken()); // 공유기의 개수
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int start = 1;
        int end = arr[N - 1]+1; // 가장 먼 집의 거리
        while(start < end){
            int mid = (start+end) / 2; // 공유기 사이의 최소 거리
            int cnt = 1; //첫번째 집에 무조건 설치
            int lastHouse = arr[0];
            for(int i=1; i<N; i++){
                if(arr[i] - lastHouse >= mid){
                    cnt++;
                    lastHouse = arr[i];
                }
            }
            if(C <= cnt){
                start = mid+1;
            } else end = mid;
        }
        System.out.println(start-1);
    }
}