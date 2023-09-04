package codingtest.book.완전탐색;

import java.util.HashSet;
import java.util.Set;

public class 소수찾기 {

    public static void main(String[] args) {
        new 소수찾기().solution("17");
    }

    private boolean isPrime(int data) {
        if (data < 2) {
            return false;
        }
        int limit = (int) Math.sqrt(data);
        for (int i = 2; i <= limit; i++) {
            if (data % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 상태 : (acc, numbers) 만들어진 숫자와, 남은 숫자를 매개로 전달
    // 종료 조건 : 더이상 만들 수 있는 숫자가 없을때 (numbers가 비어있을 때) -> (acc, 0)
    // 점화식 : 만들어놓은 숫자 acc에 사용할 수 있는 종이 조각 하나씩을 붙히면서 전이해야함. 또한 acc가 소수인지 확인해야함
    // (acc*10 + n, numbers - n)
    public void getPrime(int acc, int[] numbers, boolean[] isUsed, Set<Integer> result) {
        if (isPrime(acc)) {
            result.add(acc);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (isUsed[i]) continue;
            isUsed[i] = true;
            getPrime(acc * 10 + numbers[i], numbers, isUsed, result);
            isUsed[i] = false;
        }
    }


    public int solution(String numbers) {
        int[] collect = numbers.chars().map(c -> c - '0').toArray();
        Set<Integer> result = new HashSet<>();
        getPrime(0, collect, new boolean[numbers.length()], result);
        return result.size();
    }
}
