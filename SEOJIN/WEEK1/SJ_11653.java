package Algorithm.DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SJ_11653 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
        int num = Integer.parseInt(br.readLine());
//        int[] result = new int[range];

        for (int i = 2; i <= num ; i++) {
            while (num % i == 0){
                System.out.println(i);
                num /= i;
            }
        }

    }

}
