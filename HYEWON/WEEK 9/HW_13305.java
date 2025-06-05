import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class HW_13305{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 도시의 개수
        long[] dist = new long[N - 1];
        long[] cost = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N-1; i++){
            dist[i] = Long.parseLong(st.nextToken());// 가중치
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            cost[i] = Long.parseLong(st.nextToken());  // 휘발유 가격
        }
        long sum = 0;
        long start = cost[0]; // 시작 기름

        for(int i=0; i<N-1; i++){
            if(cost[i] < start){
                start = cost[i]; // 현재 기름보다 더 작으면 최솟값 갱신
            }
            sum += start * dist[i]; // 기름 넣기
        }
        System.out.println(sum);
    }
}