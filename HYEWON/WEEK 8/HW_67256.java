/*
(0,0) (0,1) (0,2)
(1,0) (1,1) (1,2)
(2,0) (2,1) (2,2)
(3,0) (3,1) (3,2)
*/
class HW_67256 {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10; // *
        int right = 12; // #

        for(int i=0; i<numbers.length; i++){
            int n = numbers[i];
            if(n==1 || n==4 || n==7){
                answer += 'L';
                left = n; // 좌표 갱신
            } else if(n==3 || n==6 || n==9){
                answer += 'R';
                right = n; // 좌표 갱신
            } else{ // 2, 5, 8, 0
                if(n==0) n=11;
                int leftdist = Math.abs(n-left)/3 + Math.abs(n-left)%3; // 행, 열
                int rightdist = Math.abs(n-right)/3 + Math.abs(n-right)%3;
                if(leftdist<rightdist){
                    answer += "L";
                    left = n;
                } else if(leftdist > rightdist){
                    answer += "R";
                    right = n;
                } else {
                    if(hand.equals("left")){
                        answer += "L";
                        left = n;
                    } else {
                        answer += "R";
                        right = n;
                    }
                }

            }
        }
        return answer;
    }
}