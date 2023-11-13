package codingtest.leetcode;

public class ConcatenationofArray {
    public static void main(String[] args) {
        new ConcatenationofArray().getConcatenation(new int[]{1, 2, 3});
    }
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
