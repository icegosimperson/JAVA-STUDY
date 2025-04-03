import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
소인수분해 : 소수로 나누어떨어질 때까지 나눔
ex) N=3일 경우, sqrt(3) ~= 1,73 으로 계산 되지 않음
-> 나머지 처리 과정 필요 -> if(N!=1) 조건 추가
 */
class HW_11653{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=2; i<=Math.sqrt(N); i++){
            while(N%i==0){
                System.out.println(i);
                N /= i;
            }
        }
        if(N!=1){ // 계산되지 않은 소수를 출력 하기 위함
            System.out.println(N);
        }
    }
}


/* 시행착오
class Main{
    private static int simulation(int n){
        if(n==1) System.out.println(""); // N이 1인 경우 아무것도 출력하지 않는다.
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    return i;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            System.out.println(simulation(N));
        }
    }
}
 */