import java.util.*;
public class 키패드누르기 {
    static class Hand{
        int x, y;
        public Hand(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static int distance(Hand hand, int[] dial) {
        int x = dial[0];
        int y = dial[1];
        return Math.abs((hand.x - x)) + Math.abs(hand.y - y);
    }

    public String solution(int[] numbers, String hand) {
        String answer = "";
        Map<Integer, int[]> phone = new HashMap<>();
        phone.put(1, new int[] {0, 0});
        phone.put(2, new int[] {0, 1});
        phone.put(3, new int[] {0, 2});
        phone.put(4, new int[] {1, 0});
        phone.put(5, new int[] {1, 1});
        phone.put(6, new int[] {1, 2});
        phone.put(7, new int[] {2, 0});
        phone.put(8, new int[] {2, 1});
        phone.put(9, new int[] {2, 2});
        phone.put(-1, new int[] {3, 0});
        phone.put(0, new int[] {3, 1});
        phone.put(-2, new int[] {3, 2});


        Hand left = new Hand(3, 0);
        Hand right = new Hand(3, 2);

        for(int num : numbers) {
            int[] dial = phone.get(num);
            if(num == 1 || num == 4 || num == 7) {
                answer = answer + "L";
                left.x = dial[0];
                left.y = dial[1];
                System.out.println("left " + left.x + " " + left.y);
            } else if(num == 3 || num == 6 || num == 9) {
                answer = answer + "R";
                right.x = dial[0];
                right.y = dial[1];
                System.out.println("right " + right.x + " " + right.y);
            } else {
                if(distance(left, dial) == distance(right, dial)) {
                    System.out.println(distance(left, dial));
                    System.out.println(distance(right, dial));
                    if(hand.equals("right")) {
                        answer = answer + "R";
                        right.x = dial[0];
                        right.y = dial[1];
                        System.out.println("right " + right.x + " " +  right.y);
                    } else {
                        answer = answer + "L";
                        left.x = dial[0];
                        left.y = dial[1];
                        System.out.println("left " + left.x + " " + left.y);
                    }
                } else {
                    if(distance(left, dial) < distance(right, dial)) {
                        answer = answer + "L";
                        left.x = dial[0];
                        left.y = dial[1];
                        System.out.println("left " + left.x + " " + left.y);
                    } else if(distance(left, dial) > distance(right, dial)) {
                        answer = answer + "R";
                        right.x = dial[0];
                        right.y = dial[1];
                        System.out.println("right " + right.x + " " + right.y);
                    }
                }
            }
        }




        return answer;
    }
}