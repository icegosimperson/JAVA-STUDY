//  number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자
class HW_42883 {
    public String solution(String number, int k) {
        int len = number.length()-k;
        StringBuilder sb = new StringBuilder();
        int start = 0;
        for(int i=0; i<len; i++){
            int maxIdx = start; // 현재 위치에서 남은 숫자 중 가장 큰 수를 찾기
            char maxChar = number.charAt(start);
            for(int j=start; j<=k+i; j++){
                if(maxChar < number.charAt(j)){
                    maxChar = number.charAt(j);
                    maxIdx = j;
                }
            }
            sb.append(maxChar);
            start = maxIdx + 1;
        }
        return sb.toString();
    }
}