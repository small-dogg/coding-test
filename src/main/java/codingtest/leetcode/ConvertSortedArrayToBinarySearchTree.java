package codingtest.leetcode;

public class ConvertSortedArrayToBinarySearchTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return traverse(nums, 0, nums.length - 1);
    }

    public TreeNode traverse(int[] nums, int low, int high) {
        if (low > high) return null;

        int mid = low + (high - low) / 2;

        return new TreeNode(nums[mid], traverse(nums, low, mid - 1), traverse(nums, mid + 1, high));
    }
}
