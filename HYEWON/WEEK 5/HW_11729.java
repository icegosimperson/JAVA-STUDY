import java.io.*;

// A번째 탑의 가장 위에 있는 원판을
// B번째 탑의 가장 위로 올린다

// N이 20보다 큰 경우에는 과정을 출력할 필요는 없다
// f(n) = 1(가장 큰 원반이 이동하는 횟수) + 2f(n-1)

/*
n-1개의 원판을 기둥 a에서
 */
class HW_11729{
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 장대에 쌓인 원판의 개수
        sb.append((int)Math.pow(2, n)-1).append("\n");  // f(n) = 1(가장 큰 원반이 이동하는 횟수) + 2f(n-1)
        if(n<=20){
            hanoi(n, 1, 3); // 1번 장대 -> 3번 장대
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    private static void hanoi(int n, int start, int end) throws IOException{
        if(n==1){ // 종료 조건
            sb.append(start + " " + end).append("\n");
            return;
        }
        hanoi(n-1, start,  6-start-end); // 1번 장대 -> 임시 장대로 옮김(6-a-b)
        sb.append(start + " " + end).append("\n"); // 가장 큰 원판으로 이동
        hanoi(n-1, 6-start-end, end); // 임시 장대 -> 3번 장대

    }
}