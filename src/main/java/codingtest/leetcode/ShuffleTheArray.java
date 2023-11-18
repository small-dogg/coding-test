package codingtest.leetcode;

public class ShuffleTheArray {

    public static void main(String[] args) {
        new ShuffleTheArray().shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
    }
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n * 2];
        for(int i = 0; i < n; i++) {
            result[2 * i] = nums[i];
            result[2 * i + 1] = nums[n + i];
        }
        return result;
    }
}
