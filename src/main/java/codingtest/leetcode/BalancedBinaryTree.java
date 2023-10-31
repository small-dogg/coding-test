package codingtest.leetcode;

public class BalancedBinaryTree {
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

    public boolean isBalanced(TreeNode root) {
        return isBalanced(root, 1) > -1 ? true : false;
    }

    public int isBalanced(TreeNode root, int dept) {
        if(dept == -1 || root == null) return dept;
        if(root.left == null && root.right == null) return dept;
        int left = dept;
        int right = dept;
        if(root.left != null) left = isBalanced(root.left, dept + 1);
        if(root.right != null) right = isBalanced(root.right, dept + 1);
        if(left + 1 < right || left > right + 1) return -1;
        return left > right ? left : right;
    }

//    public boolean isBalanced(TreeNode root) {
//        // If the tree is empty, we can say it’s balanced...
//        if (root == null)  return true;
//        // Height Function will return -1, when it’s an unbalanced tree...
//        if (Height(root) == -1)  return false;
//        return true;
//    }
//    // Create a function to return the “height” of a current subtree using recursion...
//    public int Height(TreeNode root) {
//        // Base case...
//        if (root == null)  return 0;
//        // Height of left subtree...
//        int leftHeight = Height(root.left);
//        // Height of height subtree...
//        int rightHight = Height(root.right);
//        // In case of left subtree or right subtree unbalanced, return -1...
//        if (leftHeight == -1 || rightHight == -1)  return -1;
//        // If their heights differ by more than ‘1’, return -1...
//        if (Math.abs(leftHeight - rightHight) > 1)  return -1;
//        // Otherwise, return the height of this subtree as max(leftHeight, rightHight) + 1...
//        return Math.max(leftHeight, rightHight) + 1;
//    }
}
