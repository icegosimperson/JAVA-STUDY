import java.io.*;

/*
거북이가 지나간 영역을 모두 포함할 수 있는 가장 작은 직사각형의 넓이를 구하는 프로그램
F: 한 눈금 앞으로
B: 한 눈금 뒤로
L: 왼쪽으로 90도 회전
R: 오른쪽으로 90도 회전

고민한 것
- (0, 0)에서 어떻게 시작할 지
- 회전 어떻게 시킬 지
 */
class HW_8911{
    static int[] dx = {0, 1, 0, -1}; // 상, 우, 하, 좌
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-->0){
            String input = br.readLine();
            sb.append(simulation(input)).append('\n');
        }
        System.out.print(sb);
    }
    private static int simulation(String input){
        int curX = 0, curY=0, dir=0; // dir : 바라보는 방향
        int top = 0, right = 0, down =0, left=0;
        for(int i=0; i< input.length(); i++){
            switch (input.charAt(i)){
                case 'F': // 한눈금 앞으로
                    curX = curX + dx[dir];
                    curY = curY + dy[dir];
                    break;
                case 'B': // 한눈금 뒤로
                    curX = curX - dx[dir];
                    curY = curY - dy[dir];
                    break;
                case 'L': // 왼쪽으로 90도 회전
                    dir = (dir+3)%4; // 좌
                    break;
                case 'R': // 오른쪽으로 90도 회전
                    dir = (dir+1)%4; // 우
                    break;
            }
            // 이동한 후의 좌표 기록하여 거북이가 지나간 전체 영역의 넓이를 구함
            left = Math.min(left, curX);
            right = Math.max(right, curX);
            down = Math.min(down, curY);
            top = Math.max(top, curY);
        }
        return (right - left) * (top - down);

        // 0, 0에서 어떻게 시작할 지 고민 중

    }
}