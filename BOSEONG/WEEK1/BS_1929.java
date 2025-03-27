import java.util.Scanner;

class BS_1929 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 여기서 처음에 범위를 정해주는 for문
        for (int i = n; i< m+1; i++){
            int count = 0;
            if(i == 1){count++;}
            // 시간 초과를 줄이기 위해 2와 짝수를 먼저 거르기
            else if(i == 2){count = 0;}
            else if(i > 2 && i % 2 == 0){count++;}
            else if(i != 1 && i >= 3){
                // 그 범위 안에서 이제 나누기를 진행할 for문(소수인지 아닌지)
                // 검사 횟수가 너무 많기 때문에 sqrt를 통해 줄이기
                // 줄여도 되는 이유는 sqrt로 나눈 후에 나누는 거나 sqrt하기 전 원래 숫자로 나누는 거나 똑같이 소수를 구분 해낼 수 있기 떄문
                for (int j = 3; j <= (int) Math.sqrt(i); j ++ ){
                    if(i % j == 0){
                        count++;
                        break;
                    }
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
