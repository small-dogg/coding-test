package codingtest.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    // n계의 계단을 올라야하고, 한번에 1 또는 2 계단만 오를 수 있음. 몇가지 밥법으로 오를 수 있는가.
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);

    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if(n==1 || n== 2) return n;
        if(!memo.containsKey(n)){
            memo.put(n, climbStairs(n - 1, memo) + climbStairs(n - 2, memo));
        }
        return memo.get(n);
    }


}
