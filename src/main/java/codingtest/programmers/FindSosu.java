package codingtest.programmers;

import java.util.HashSet;
import java.util.Iterator;

public class FindSosu {
    HashSet<Integer> numberSet = new HashSet<>();
    static boolean[] check = new boolean[7];

    public static void main(String[] args) {
        new FindSosu().solution("137");
    }

    public int solution(String numbers) {
        int cnt =0;
        //1. 모든 조합의 숫자를 만든다.
        recursive("", numbers);
        Iterator<Integer> iterator = numberSet.iterator();
        while (iterator.hasNext()) {
            if (prime(iterator.next())) {
                cnt++;
            }
        }
        return cnt;
    }

    private boolean prime(int data) {
        if (data < 2) {
            return false;
        }
        int limit = (int)Math.sqrt(data);
        for (int i = 2; i <= limit; i++) {
            if (data % i == 0) {
                return false;
            }
        }
        return true;
    }

    //comb : 여태까지 조합된 숫자, others : 사용하지 않은 숫자
    private void recursive(String comb, String others) {//"",17
        //1. 현재 조합을 set에 추가한다.
        System.out.println(comb+","+others);
        if (!comb.equals(""))
            numberSet.add(Integer.valueOf(comb));

        //2. 남은 숫자 중 한개를 더해 새로운 조합을 만든다.
        for (int i = 0; i < others.length(); i++) {
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i + 1));
        }
    }

    /**
     * 1,3,7
     * 1,37
     * 13,7
     * 137
     * 종료
     *
     */

}
