package codingtest.programmers;

import java.util.HashMap;
import java.util.Map;

public class Phoneketmon {
    public int solution(int[] nums) {
        Map<Integer, Integer> phonkeMap = new HashMap<>();

        for (int num : nums) {
            phonkeMap.put(num, phonkeMap.getOrDefault(num, 0));
        }
        int phokesize = phonkeMap.keySet().size();
        int result = phokesize < nums.length / 2 ? phokesize : nums.length / 2;


        return result;
    }
}
