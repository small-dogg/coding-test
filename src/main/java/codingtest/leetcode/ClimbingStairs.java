package codingtest.leetcode;

public class ClimbingStairs {
    // n계의 계단을 올라야하고, 한번에 1 또는 2 계단만 오를 수 있음. 몇가지 밥법으로 오를 수 있는가.
    public int climbStairs(int n) {
        if(n==1 || n== 2) return n;

        int[] arr = new int[46];
        arr[1] = 1;
        arr[2] = 2;

        return climbStairs(n-1) + climbStairs(n-2);
    }
}
