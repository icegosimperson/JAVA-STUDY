package SUMIN.week10;

import java.util.*;
import java.io.*;
public class Q1182 {
    static int[] sequence;
    static int N;
    static int S;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        sequence = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0, 0);

        System.out.println(S == 0 ? count-1 : count); //합이 0이면 공집합 가능 -> 하나 빼주기

    }

    static void dfs(int index, int sum) {
        if (index == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        dfs(index + 1, sum + sequence[index]); //현재 숫자를 합계에 포함 한 경우
        dfs(index + 1, sum); // 현재 숫자를 합계에 포함하지 않은 경우
    }
}
