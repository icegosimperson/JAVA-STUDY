import java.io.*;
import java.util.StringTokenizer;

// 자연수 A를 B번 곱한 수
/*
A가 커짐 -> 메모리 터짐
--> A를 줄이는 방법 : %C
B가 터짐 -> 메모리 터짐
--> B를 줄이는 방법
1) B가 홀수일 때
2) B가 짝수일 때 나눠서 풀어야함
 */

class HW_1629{
    static int C;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken()); // depth
        C = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(recursion(A, B)));
        bw.flush();
        bw.close();
    }
    private static long recursion(int a, int b){
        if(b==1){
            return a%C;// 종료 조건
        }

        long temp = recursion(a, b / 2); // /2 줄여나감
        if(b%2==0){ // 짝수일 경우
            return temp * temp % C;
        } else{
            return temp * temp %C * a % C;
        }
    }
}

/*
메모리 초과
이유 : B가 클 경우 10000번 넘어서 메모리 터짐
import java.io.*;
import java.util.StringTokenizer;

// 자연수 A를 B번 곱한 수

class Main{
    static int A, B, C;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        A = Integer.parseInt(st.nextToken());
        B= Integer.parseInt(st.nextToken()); // depth
        C = Integer.parseInt(st.nextToken());
        recursion(A, 0);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
    private static void recursion(int a, int depth){x
        if(depth==B){ // 종료 조건
            answer = a % C;
            return;
        }
        a = (a * a)%C;
        recursion(a, depth+1);
    }
}

 */
