import java.util.Scanner;

// 소수찾기
class BS_1978{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        // 배열 만들었으니 이제 소수 찾기인데
        // 2 3 5 7 11 13 17 19 얘네는 일단 1로 나누면 다 나눠지니까
        // 1 들어오면 그냥 += 0 처리
        // 2 이상으로 나눴을 때 나머지가 무조건 있음 - 2도 소수니까 += 1 처리
        // 예를 들어 7이면 2,3,4,5,6으로 나누기 할건데 이때 그러면 count를 줘서 나눴는데
        // 나머지가 0이 아닌 횟수 + 2 값이 자기 자신이랑 같다면? answer += 1
        // 기준을 2로 잡을거니까 만약 배열 안의 값이 2라면 그냥 자동으로 answer += 1
        for (int j = 0; j<n; j++){
            int count =0;
            if(arr[j] == 1){
                count += 1;
            }
            else if(arr[j] == 2){
                count = 0;
            }
            else{
                for(int k = 2; k < arr[j]; k++){
                    if(arr[j] % k == 0){
                        count += 1;
                    }
                }
            }
            if(count < 1){
                answer +=1;
            }
        }
        System.out.println(answer);
    }
}