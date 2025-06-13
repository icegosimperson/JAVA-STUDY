import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class HW_9935{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        String bomb = br.readLine(); // check 문자열

        String answer = simulation(input, bomb);
        System.out.println((answer.length() == 0) ? "FRULA" : answer);
    }
    private static String simulation(String input, String bomb){
        Stack<Character> stack = new Stack<>();
        int length = bomb.length();

        for(int i=0; i<input.length(); i++){
            stack.push(input.charAt(i));
            if(stack.size()>=length){
                boolean flag = true;
                for(int j=0; j<length; j++){
                    if(stack.get(stack.size()-length+j)!=bomb.charAt(j)){ // 스택의 끝부분과 bomb 비교
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0; j<length; j++){
                        stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}