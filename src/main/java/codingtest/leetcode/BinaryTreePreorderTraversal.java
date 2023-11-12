package codingtest.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreePreorderTraversal {
    public class TreeNode {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return new ArrayList<>();
        if(root.left == null && root.right == null) return Arrays.asList(root.val);

        List<Integer> result = new ArrayList<>();
        result.add(root.val);
        preOrder(root, result);

        return result;
    }

    public void preOrder(TreeNode node, List<Integer> list) {
        if(node.left!=null){
            list.add(node.left.val);
            preOrder(node.left, list);
        }
        if(node.right!=null){
            list.add(node.right.val);
            preOrder(node.right, list);
        }
    }
}
