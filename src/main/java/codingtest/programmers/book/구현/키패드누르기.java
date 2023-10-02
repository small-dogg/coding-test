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

    private int getX(int number) {
        if (number == 0) return 1;
        return (number - 1) % 3;
    }

    private int getY(int number) {
        if (number == 0) return 3;
        return (number - 1) / 3;
    }

    public String solution(int[] numbers, String hand) {
        Hand right = new Hand("R", hand.equals("right"), 2);
        Hand left = new Hand("L", hand.equals("left"), 2);

        return Arrays.stream(numbers)
                .mapToObj(n -> press(n, right, left).hand)
                .collect(Collectors.joining());
    }
}
