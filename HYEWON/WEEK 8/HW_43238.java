import java.util.*;
/*
모든 사람이 심사를 받는데 걸리는 시간의 최솟값을 return
*/
class HW_43238 {
    public long solution(int n, int[] times) {
        Arrays.sort(times);
        long start = times[0];
        long end = times[times.length-1] * (long)n; // 최악의 시간
        while(start < end){
            long mid = (start+end)/2;
            long target =  0;
            for(int i=0; i<times.length; i++){
                target += mid/times[i];
            }
            if(target < n){
                start = mid+1;
            } else{
                end = mid;
            }
        }
        return start;
    }
}