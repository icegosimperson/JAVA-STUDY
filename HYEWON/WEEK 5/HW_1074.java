import java.io.*;
import java.util.StringTokenizer;

// r행 c열을 몇 번째로 방문했는지 출력
/*
4등분
[0] [1]
[2] [3]

처음에 배열 초기값 세팅해주는 방식으로 접근 -> 2^15 * 2^15 -> 메모리 터짐
재귀로 접근 -> (r, c)가 몇번째로 방문하는지 알기
1. 현재 위치(r, c)가 어느 사분면에 속한지 찾기
2. 몇번째 사분면에 속하는지지 판단
3. 재귀 반복
 */
class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(recursion(N, r, c)));
        bw.flush();
        bw.close();
    }
    private static int recursion(int n, int r, int c){
        if(n==0){
            return 0;
        }

        // 2^n-1씩 줄여나가야함
        int half = 1 << (n - 1); // 2^(n-1)
        int offset = half * half; // 0, 4, 8, 12 각 사분면에 처음 시작할 좌표

        /*
        [0] [1]
        [2] [3]
         */
        if(r<half && c<half){ // 1사분면 [0]
            return recursion(n - 1, r, c);
        } else if(r<half && c>=half){ // 2사분면 [1]
            return offset + recursion(n-1, r, c-half); // (2,0) -> (0,0) 작은 사각형 기준 좌표로 으로 재귀
        } else if(r>=half && c<half){ // 3사분면 [2]
            return 2* offset + recursion(n-1, r-half, c);
        } else{ // 4사분면 [3]
            return 3 * offset + recursion(n - 1, r - half, c - half);
        }
    }
}