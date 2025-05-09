import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HJ1644 {
    private static boolean[] primes;
    private static List<Integer> primeNumbers = new ArrayList<Integer>();
    private static void Eratos(int N) { //에라토스테네스의 체 O(Nlog(logN))
        primes[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(N); i++) {
            int target = i;
            for(int j = 2; j * target <= N; j++) {
                primes[j * target] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        primes = new boolean[N + 1];

        Arrays.fill(primes, true);
        Eratos(N);

        //판별된 소수들 List에 저장
        for(int i = 2; i <= N; i++) {
            if(primes[i]) primeNumbers.add(i);
        }

        //투포인터로 전체 범위 내 합 조회
        int cnt = 0, start = 0, end = 0, sum = 0;

        while(true) {
            if(sum >= N) sum -= primeNumbers.get(start++);
            else if(end == primeNumbers.size()) break;
            else sum += primeNumbers.get(end++);

            if(sum == N) cnt++;
        }

        br.close();
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
