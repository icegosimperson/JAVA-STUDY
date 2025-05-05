package SUMIN.week5;

import java.util.*;
import java.io.*;
public class Q1780 {
    static int[][] arr;
    static int[] answer;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine()); // N X N 행렬
        answer = new int[3]; //정답을 담을 배열

        arr = new int[N][N]; //입력한 숫자들을 담을 배열

        //
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        division(0,0,N);
        System.out.println(answer[0]); // -1
        System.out.println(answer[1]); // 0
        System.out.println(answer[2]); // 1
    }

    static void division(int x, int y, int N) {

        if (check(x, y, N)) {
            answer[arr[x][y]+1]++;
            return;
        }

        int size = N/3;

        division(x,y,size); //1
        division(x,y+size,size);//2
        division(x,y+size*2,size);//3

        division(x+size,y,size);//4
        division(x+size,y+size,size);//5
        division(x+size,y+size*2,size);//6


        division(x+size*2,y,size);  // 7
        division(x+size*2,y+size,size); //8
        division(x+size*2,y+size*2,size); //9

    }

    public static boolean check(int x, int y, int N) {



        int firstBlock = arr[x][y];

        for (int i = x; i < x+N; i++) {
            for (int j = y; j < y+N; j++) {
                if (firstBlock != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
