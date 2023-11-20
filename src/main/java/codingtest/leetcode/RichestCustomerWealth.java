package codingtest.leetcode;


public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int val = 0;
            for (int i : account) {
                val += i;
            }
            if(max<val) max = val;
        }
        return max;

    }
}
