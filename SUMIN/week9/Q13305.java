package SUMIN.week9;

import java.io.*;
import java.util.*;
public class Q13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int city = Integer.parseInt(br.readLine()); // 도시 개수

        int[] oil = new int[city-1]; //필요한 기름 양
        int[] oilCost = new int[city]; //도시 별 기름 가격

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < oil.length; i++) { //필요한 기름 양 입력
            oil[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int prevMin = Integer.MAX_VALUE; //전인덱스 기준으로 최솟값 저장하는 변수

        for (int i = 0; i < oilCost.length; i++) {
            int currentValue = Integer.parseInt(st.nextToken());

            if(prevMin > currentValue){ //이전 비용보다 현재 비용이 더 작을 경우 현재 비용으로 갱신
                oilCost[i] = currentValue;
                prevMin = currentValue;
            }else{ // 같거나 클 경우
                oilCost[i] = prevMin; // 이전 비용을 그대로 사용
            }
        }
        br.close();
        long result = 0; //결과(최소 비용)

        for(int i = 0; i < city-1; i++){
            result += ((long) oilCost[i] *oil[i]);
        }

        System.out.println(result);
    }
}
