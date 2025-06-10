import java.io.*;
import java.util.*;

public class HJ15787 {
    private static Map<Integer, Map<Integer,Boolean>> trains = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) {
            trains.put(i, new HashMap<>());
            for(int j = 1; j <= 20; j++) {
                trains.get(i).put(j, false);
            }
        }

        while(M-- > 0) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int train = Integer.parseInt(st.nextToken());
            int seat = -1;
            if(st.hasMoreTokens()) seat = Integer.parseInt(st.nextToken());

            switch(command) {
                case 1 :
                    trains.get(train).put(seat, true);
                    break;
                case 2 :
                    trains.get(train).put(seat, false);
                    break;
                case 3 :
                    for(int i = 20; i >= 2; i--) {
                        trains.get(train).put(i, trains.get(train).get(i - 1));
                    }
                    trains.get(train).put(1, false);
                    break;
                case 4 :
                    for(int i = 1; i <= 19; i++) {
                        trains.get(train).put(i, trains.get(train).get(i + 1));
                    }
                    trains.get(train).put(20, false);
                    break;
            }
        }

//        //입력된 자료 확인
//        for(int i : trains.keySet()) {
//            System.out.println("trainNum : " + i);
//            for(int j = 1; j <= 20; j++) {
//                System.out.println(j + " " + trains.get(i).get(j));
//            }
//        }

        StringBuilder sb = null;
        Set<String> set = new HashSet<>();
        for(int i = 1; i <= N; i++) {
            sb = new StringBuilder();
            for(int j = 1; j <= 20; j++) {
                if(trains.get(i).get(j)) {
                    sb.append(1 + " ");
                } else {
                    sb.append(0 + " ");
                }
            }
            set.add(sb.toString());
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
