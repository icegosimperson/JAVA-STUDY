import java.util.*;
import java.io.*;

public class HJ11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());
        Set<Integer> set = new HashSet<>();

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = -1;
            if(st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());

            switch(command) {
                case "add" :
                    set.add(num);
                    break;
                case "check" :
                    sb.append(set.contains(num) ? "1" : "0").append("\n");
                    break;
                case "remove" :
                    set.remove(num);
                    break;
                case "toggle" :
                    if(set.contains(num)) {
                        set.remove(num);
                    } else {
                        set.add(num);
                    }
                    break;
                case "all" :
                    for(int i = 1; i <= 20; i++) {
                        set.add(i);
                    }
                    break;
                case "empty" :
                    set.clear();
                    break;
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();

    }
}
