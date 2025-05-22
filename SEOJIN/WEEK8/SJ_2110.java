import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SJ_2110 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int C = Integer.parseInt(stringTokenizer.nextToken());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }

        Arrays.sort(arr);

        //탐색 범위 설정 : 두 집 사이의 거리
        int left = 1;
        int right = arr[N-1] - arr[0];
        int answer = 0;

        while (left <= right){
            int mid = (left + right) / 2;

            int count = 1; // 첫 집엔 무조건 설치
            int lastInstalled = arr[0]; // 첫 설치 위치

            for (int i = 1; i < N; i++) {
                if (arr[i] - lastInstalled >= mid) {
                    count++;
                    lastInstalled = arr[i];
                }
            }

            //mid 업데이트 하는 조건 -> 문제에서의 조건을 확인
            if (count >= C){
                answer = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        System.out.println(answer);

    }

}
