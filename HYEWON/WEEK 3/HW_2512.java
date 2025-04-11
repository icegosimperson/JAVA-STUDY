import java.io.*;
import java.util.StringTokenizer;

/* 시간 복잡도
정해진 총액 이하에서 가능한 최대의 총 예산을 배정
매개변수 탐색 : "정답이 될 수 있는 범위"를 기준으로 이분 탐색해서 푸는 것
*/
class HW_2512{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // 지방의 수
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        int s = 0;
        int e = -1; // 예산의 최대 금액
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            e = Math.max(e, arr[i]); // 최대값 갱신
        }
        int M = Integer.parseInt(br.readLine()); // 총 예산을 나타내는 변수

        while(s<=e){
            int mid = (s+e)/2;
            long sum = 0;
            for(int i=0; i<N; i++){
                sum += Math.min(mid, arr[i]);
            }
            if(sum <=M) s=mid+1;
            else e = mid-1;
        }
        bw.write(String.valueOf(e));
        bw.flush();
        br.close();
    }
}