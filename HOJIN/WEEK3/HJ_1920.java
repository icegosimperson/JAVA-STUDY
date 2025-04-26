import java.util.*;
import java.io.*;
public class HJ_1920 {
    public static boolean search(int target, int[] A) {
        int start = 0;
        int end = A.length - 1;

        while(start <= end) {
            //가운데 인덱스 선정
            int mid = (start + end) / 2;
            //가운데 인덱스가 타겟 넘버면 반환
            if(A[mid] == target) return true;
            else if(target <  A[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        //주어진 정수들 입력
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        //A배열 오름차순 정렬
        Arrays.sort(A);

        //확인해야할 정수들 입력
        int M = Integer.parseInt(br.readLine());
        int[] toCheck = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M ; i++) {
            toCheck[i] = Integer.parseInt(st.nextToken());
        }

        for(int num : toCheck) {
            sb.append(search(num, A) ? "1\n" : "0\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
