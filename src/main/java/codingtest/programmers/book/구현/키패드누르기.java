package codingtest.programmers.book.구현;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 키패드누르기 {
    public static class Hand {
        private final int baseX; // 해당 손만 담당하는 키패드 위치
        public final String hand; // 어느쪽 손
        public final float preference; // 오른손잡이 or 왼손잡이

        //현재 손가락의 위치 정보
        private int x;
        private int y;

        public Hand(String hand, boolean isPreference, int x) {
            this.hand = hand;
            this.baseX = x;
            this.preference = isPreference ? 0.5f : 0;
            this.x = x;
            this.y = 3;
        }

        public float distance(int x, int y) {
            if (x == baseX) return 0;
            int distance = Math.abs(x - this.x) + Math.abs(y - this.y);
            return distance - preference;
        }

        public void move(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private int getX(int number) {
        if (number == 0) return 1;
        return (number - 1) % 3;
    }

    private int getY(int number) {
        if (number == 0) return 3;
        return (number - 1) / 3;
    }

    private Hand press(int number, Hand right, Hand left) {
        int x = getX(number);
        int y = getY(number);

        float rDistance = right.distance(x, y);
        float lDistance = left.distance(x, y);

        Hand hand = right;
        if (lDistance < rDistance) {
            hand = left;
        }
        hand.move(x, y);
        return hand;
    }

    public String solution(int[] numbers, String hand) {
        Hand right = new Hand("R", hand.equals("right"), 2);
        Hand left = new Hand("L", hand.equals("left"), 0);

        return Arrays.stream(numbers)
                .mapToObj(n -> press(n, right, left).hand)
                .collect(Collectors.joining());
    }
}

//import java.util.Arrays;
//        import java.util.List;
//
//class Solution {
//    private List<Integer> lt = Arrays.asList(1, 4, 7);
//    private List<Integer> rt = Arrays.asList(3, 6, 9);
//
//    public String solution(int[] numbers, String hand) {
//        String result = "";
//        int l = 10;
//        int r = 12;
//        for (int number : numbers) {
//            //1,3,4,6,7,9 처리
//            if(lt.contains(number)){
//                result+="L";
//                l = number;
//            }else if(rt.contains(number)){
//                result+="R";
//                r = number;
//            }else{
//                int ld = distance(l, number);
//                int rd = distance(r, number);
//                if(ld>rd){
//                    result+="R";
//                    r = number;
//                } else if (rd > ld) {
//                    result+="L";
//                    l = number;
//                }else{
//                    if(hand.equals("right")){
//                        result+="R";
//                        r = number;
//                    }else{
//                        result+="L";
//                        l = number;
//                    }
//
//                }
//            }
//        }
//
//        return result;
//    }
//
//    private int distance(int location, int number) {
//        if(number==0) number=11;
//        if(location==0) location=11;
//
//        return Math.abs(location-number)/3+Math.abs(location-number)%3;
//    }
//}