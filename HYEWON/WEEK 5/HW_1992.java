import java.io.*;

/*
흰점 : 0
검은 점 : 1
[0] [1]
[2] [3]
4개의 영역으로 압축
 */
class BOJ_1992{
    static int N;
    static int[][] board;
    static  StringBuilder sb = new StringBuilder(new StringBuilder());
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        board = new int[N][N];

        for(int i=0; i<N; i++){
            String line = br.readLine();
            for(int j=0; j<N; j++){
                board[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        Quad(0, 0, N);
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    private static void Quad(int r, int c, int size){
        if(check(r, c, size)){ // 종료 조건
            sb.append(board[r][c]);
            return;
        }
        int newSize = size/2;

        sb.append('(');
        Quad(r, c, newSize); // [0]
        Quad(r, c+newSize, newSize); // [1]

        Quad(r+newSize, c, newSize); // [2]
        Quad(r + newSize, c + newSize, newSize); // [3]
        sb.append(')');
    }
    private static boolean check(int r, int c, int size){
        int number = board[r][c];
        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if(board[i][j] != number){
                    return false;
                }
            }
        }
        return true;
    }
}