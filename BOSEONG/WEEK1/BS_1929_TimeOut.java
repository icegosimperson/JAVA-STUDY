import java.util.Scanner;

class BS_1929_TimeOut {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        // 여기서 처음에 범위를 정해주는 for문
        for (int i = n; i< m+1; i++){
            int count = 0;
            if(i == 1){count++;}
            else if(i != 1 && i >= 3){
                // 그 범위 안에서 이제 나누기를 진행할 for문(소수인지 아닌지)
                for (int j = 2; j < i; j++){
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
