package SUMIN.week6;

import java.util.*;
import java.io.*;

//거북이
//F: 한 눈금 앞으로
//B: 한 눈금 뒤로
//L: 왼쪽으로 90도 회전
//R: 오른쪽으로 90도 회전
public class Q8911 {
    static int[] dx = {0, 1, 0, -1}; //북, 동, 남, 서
    static int[] dy = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while(caseNum-- > 0) {
            int x = 0, y = 0, minX = 0, minY = 0, maxX = 0, maxY = 0, direction = 0;
            String testcase = br.readLine();
            for (int i = 0; i < testcase.length(); i++) {
                char c = testcase.charAt(i);
                switch (c) {
                    case 'F' :
                        x += dx[direction];
                        y += dy[direction];
                        break;
                    case 'B' :
                        x -= dx[direction];
                        y -= dy[direction];
                        break;
                    case 'L' :
                        if (direction == 0) direction = 3;
                        else direction -= 1;
                        break;
                    case 'R' :
                        if (direction == 3) direction = 0;
                        else direction += 1;
                        break;
                }
                maxX = Math.max(x, maxX);
                maxY = Math.max(y, maxY);
                minX = Math.min(x, minX);
                minY = Math.min(y, minY);
            }
            sb.append(Math.abs(maxX - minX) * Math.abs(maxY - minY)).append("\n");
        }
        System.out.println(sb);
    }
}
