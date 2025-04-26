package SUMIN.week3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SOO_Q2512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int localNum = Integer.parseInt(br.readLine()); // 지방 수
        int[] wishBudget = new int[localNum]; //지방에서 원하는 예산 저장하는 배열

        st = new StringTokenizer(br.readLine());

        int max = 0;
        int min = -1;

        for (int i = 0; i < localNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            wishBudget[i] = num;
            max = Math.max(max, wishBudget[i]);
        }

        int budget = Integer.parseInt(br.readLine());

        while (min <= max) {
            int mid = (min + max) / 2;
            long budgetSum = 0;

            for (int i = 0; i < localNum; i++) {
                if (wishBudget[i] > mid) {
                    budgetSum += mid;
                } else {
                    budgetSum += wishBudget[i];
                }
            }

            if(budgetSum <= budget) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        System.out.println(max);

    }

}
