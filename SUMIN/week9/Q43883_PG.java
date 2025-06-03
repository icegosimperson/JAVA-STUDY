package SUMIN.week9;

import java.util.*;
class Solution {
    public String solution(String number, int k) {
        //문자열을 담아야함 -> StringBuilder 이용
        StringBuilder sb = new StringBuilder();
        //number 문자열을 하나씩 잘라서 toCharArray를 이용하여 배열로 만듦
        char[] num = number.toCharArray();
        //정답 길이(k개를 제외한)
        int ansLen = number.length() - k;
        //시작하는 인덱스
        int start = 0;

        //문자열의 길이가 ansLen(number.length() - k)가 될때까지 반복
        while (start < number.length() && sb.length() != ansLen) {
            //최댓값을 찾는 숫자 갯수
            int endNumber = k + sb.length();
            int maxNumber = 0;

            //start 인덱스의 숫자 값부터 endNumber 자릴 수 사이의 숫자들로 반복문 돌려서 최댓값 찾아주기
            for (int i = start; i <= endNumber; i++) {
                //아스키코드에서 - '0'을 해주면 숫자로 계산할 수 있음
                if (maxNumber < number.charAt(i) - '0') {
                    //최댓값 업데이트
                    maxNumber = number.charAt(i) - '0';
                    //최댓값을 찾았으면 그 수 뒤에서부터 다시 반복
                    start = i+1;
                }
            }
            sb.append(Integer.toString(maxNumber));
        }

        return sb.toString();
    }
}