import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HW_1780 {
    static int N;
    static int[][] paper;
    static int MinusOne = 0; // -1
    static int ZERO = 0; // 0
    static int ONE = 0; // 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        quad(0, 0, N);

        bw.write(String.valueOf(MinusOne)+"\n"); // -1
        bw.write(String.valueOf(ZERO)+"\n");
        bw.write(String.valueOf(ONE));
        bw.flush();
        bw.close();
    }
    private static void quad(int r, int c, int size){
        if(check(r, c, size)){ // 같은 숫자로 이루어진 영역인지 확인
            if(paper[r][c]==-1){
                MinusOne++;
            } else if(paper[r][c]==0){
                ZERO++;
            } else{
                ONE++;
            }
            return;
        }
        int newSize = size/3; // 같은 숫자로 이루어진 영역이 아닐 경우 3x3으로 9등분해서

        /*
        [0] [1] [2]
        [3] [4] [5]
        [6] [7] [8]
         */
        quad(r, c, newSize); // [0]
        quad(r, c + newSize, newSize); // [1]
        quad(r, c + 2 * newSize, newSize); // [2]

        quad(r + newSize, c, newSize); // [3]
        quad(r + newSize, c + newSize, newSize); //[4]
        quad(r + newSize, c + 2 * newSize, newSize); //[5]

        quad(r + 2 * newSize, c, newSize); // [6]
        quad(r + 2 * newSize, c + newSize, newSize); // [7]
        quad(r + 2 * newSize, c + 2*newSize, newSize); // [8]
    }
    private static boolean check(int r, int c, int size){
        int color = paper[r][c];
        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if(color != paper[i][j]){
                    return false; // 하나라도 다를 경우 다른 종이임
                }
            }
        }
        return true; // 전부 같은 색
    }
}