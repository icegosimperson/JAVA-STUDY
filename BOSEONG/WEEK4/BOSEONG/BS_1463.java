import java.util.Scanner;

public class BS_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int [] arr = new int[input + 1];
        //1은 차피 연산안해도 1이니까 0번
        arr[1] = 0;
        // 0이랑 1은 처리 했으니까 바로 2부터 시작
        for (int i = 2; i <= input; i++) {
            // -1 연산하는 건데 i - 1에 다가 1을 더해주는 것!
            // 왜냐면 2는 1이 되기 위해 연산 한번 해야하고
            // 추가로 5였다면 + 4 되야하는데 계속 하면 연산을 많이하니까
            // dp활용해서 이전에 계산 했던 것들 점점 + 1해서 될 테니까
            // 그거 이용해서 + 1씩 하면 뒤에도 다 가능!
            arr[i] = arr[i-1] + 1;

            //그리고 이제 2로 나눠질 때
            // 여기서 최소로 더 구하는 이유가 나눠서 가면 그만큼 더 줄어 들기 떄문에 맞게 가야함!
            if( i % 2 == 0){
                arr[i] = Math.min(arr[i], arr[i/2] + 1);
            }
            // 3으로 나눌 떄
            if( i % 3 == 0){
                arr[i] = Math.min(arr[i], arr[i/3] + 1);
            }
        }
        System.out.println(arr[input]);
    }
}