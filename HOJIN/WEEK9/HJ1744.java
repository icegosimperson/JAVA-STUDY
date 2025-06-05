import java.util.*;
import java.io.*;
public class HJ1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        int ones = 0;
        int zeros = 0;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > 1) positive.add(num);
            else if(num == 1) ones++;
            else if(num == 0) zeros++;
            else negative.add(num);
        }

        //Collections.sort방법 -> Java 1.2 이후부터
//        Collections.sort(positive, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b.compareTo(a);
//            }
//        });

        //list.sort방법 -> Java 8.0 이후부터
        positive.sort((a, b) -> b -a );
//        positive.sort(Collections.reverseOrder());
        negative.sort(Comparator.naturalOrder());

        int sum = 0;

        for(int i = 0; i < positive.size() - 1; i += 2) {
            sum += positive.get(i) * positive.get(i + 1);
        }
        if(positive.size() % 2 == 1) {
            sum += positive.get(positive.size() - 1);
        }


        for(int i = 0; i < negative.size() - 1; i += 2) {
            sum += negative.get(i) * negative.get(i + 1);
        }
        if(negative.size() % 2 == 1) {
            if(zeros == 0) { //zero가 하나라도 있으면 상쇄
//                sum += negative.getLast(); // list.getLast()는 Java21부터 도입됨
                sum += negative.get(negative.size() - 1);
            }
        }

        sum += ones;

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
