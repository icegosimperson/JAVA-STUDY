package src;

import java.io.*;
import java.util.*;

//시간복잡도 -> O(nlogn)
public class HJ_11722_LIS {
    private static int binarySearch(LinkedList<Integer> nums, int start, int end, int num) {
        while(start < end) {
            int mid = (start + end) / 2;
            int midNum = nums.get(mid);
            if(midNum == num) return mid;
            if(midNum < num) start = mid + 1;
            else end = mid;
        }
        return (start + end) / 2;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //전체 숫자 갯수 입력
        int N = Integer.parseInt(br.readLine());

        //숫자 배열 입력
        int[] nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        LinkedList<Integer> dp = new LinkedList<>();

        dp.add(nums[N - 1]);
        for(int i = nums.length - 2; i >= 0; i--) {
            int currNum = nums[i];
            int lastNum = dp.getLast();
            if(lastNum < currNum) dp.add(currNum);
            else {
                int newEnd = binarySearch(dp, 0, dp.size() - 1, currNum);
                dp.set(newEnd, currNum); //set함수로 덮어쓰기
            }
        }

        int result = dp.size();
        br.close();
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
}
