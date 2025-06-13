import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

class HW_2671{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Pattern pattern = Pattern.compile("(100+1+|01)+");

        if(pattern.matcher(input).matches()){
            System.out.println("SUBMARINE");
        } else{
            System.out.println("NOISE");
        }
    }
}