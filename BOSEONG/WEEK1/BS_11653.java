import java.util.Scanner;

// 소수찾기
class BS_11653{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 2;
        // 숫자가 주어짐
        // 그 다음 소인수 분해한 값들을 하나씩 내보내야함
        // 좀 크긴 하지만 for문을 2부터 시작해서 나머지가 0이면 내보내고 범위 값 수정
        while(a != 1){
            if(a % i == 0){
                System.out.println(i);
                a /= i ;
            }
            else{
                i += 1;
            }
        }
    }
}