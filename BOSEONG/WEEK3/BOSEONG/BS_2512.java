import java.io.*;
import java.util.*;

public class BS_2512 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String args[]) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        // 이분탐색 좌우 일단 초기화 해놓고 right는 가장 큰 값을 넣은 다음에 하나하나씩 넣는 거임!
        int left = 0;
        int right = 0;

        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, arr[i]); // 이게 방금 말한 그거임
        }
        // 정부가 주는 최대 금액액액
        int max = Integer.parseInt(br.readLine());

        while(left <= right) {
			int mid = (left + right) / 2;
			long money = 0;
			for(int i=0; i<n; i++) {
				if(arr[i] > mid)
                    money += mid;
				else
                    money += arr[i];
			}
            // 이런식으로 계산 했을 떄 최대값 못 넘기면 왼쪽 범위가 커짐!
            // 이렇게 범위 줄여가면서 값 찾기기
			if(money <= max)
				left = mid + 1;
			else
				right = mid - 1;
		}
        System.out.print(right);
       
    }
}
