import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
N <= 4*10^6 -> O(N^2) 시간초과 -> 브루트포스 X
투포인터 = 배열에서 원래 이중 for문으로 O(N^2)에 처리되는 작업을
2개의 포인터 움직임으로 O(N)으로 해결하는 알고리즘

알고리즘 : 투포인터
연속된 소수의 합을 찾는 문제 -> 부분합 문제로 변환

 */
class BOJ_1644{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[N + 1]; // 소수만 기록하는 배열
        Arrays.fill(isPrime, true); // 처음엔 전부 소수라고 가정
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님
        // 에라토스테네스의 체
        for(int i=2; i*i<=N; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=N; j= j+i) { // i의 배수라면
                    isPrime[j] = false; // 소수가 아님
                }
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for(int i=2; i<=N; i++){
            if(isPrime[i]){ // 소수일 경우
                primeList.add(i); // 리스트에 모아서 저장
            }
        }

        int left = 0, right = 0, sum = 0, cnt = 0;

        while(true) {
            if (N <= sum) { // sum : 소수들의 합이 N보다 클 경우
                sum = sum - primeList.get(left++); // 탐색 구간을 축소 left++
            } else if (right == primeList.size()) { // 리스트 끝까지 탐색 시 종료
                break;
            } else { // 합이 작을 경우
                sum = sum + primeList.get(right++); // 탐색 구간을 확장 right++
            }
            if (sum == N) {
                cnt++;
            }

        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();

    }
}