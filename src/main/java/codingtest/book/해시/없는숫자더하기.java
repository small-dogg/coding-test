package codingtest.book.해시;

import java.util.HashSet;
import java.util.Set;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        Set<Integer> num = new HashSet<>();
        for (int number : numbers) {
            num.add(number);
        }

        int sum = 0;

        for (int i = 0; i < 10; i++) {
            if(!num.contains(i)){
                sum += i;
            }
        }

        return sum;
    }

    public int solution2(int[] numbers) {
        int sum = 45;

        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}
