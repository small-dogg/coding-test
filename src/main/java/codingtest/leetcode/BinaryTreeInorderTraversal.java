package codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversal(root, result);

        return result;
    }

    public void inorderTraversal(TreeNode root, List<Integer> result) {
        if(root != null) {
            if(root.left != null) inorderTraversal(root.left, result);
            result.add(root.val);
            if(root.right != null) inorderTraversal(root.right, result);
        }

    }

}

