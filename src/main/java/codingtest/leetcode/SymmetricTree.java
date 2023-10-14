package codingtest.leetcode;

public class SymmetricTree {

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


    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }

    public boolean isSame(TreeNode left, TreeNode right) {


        if (left ==null && right == null)return true;

        else if (left ==null || right == null)return false;

        if (left.val == right.val) {
            return isSame(left.right, right.left) && isSame(left.left, right.right);
        }
        else return false;
    }
}
