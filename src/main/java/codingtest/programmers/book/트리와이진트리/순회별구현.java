package codingtest.programmers.book.트리와이진트리;

public class 순회별구현 {
    private static class Node {
        private Node left;
        private Node right;
        private Node parent;
        private int data;
    }

    void pre(Node node) {
        if (node == null) return;

        System.out.println(node.data);

        pre(node.left);
        pre(node.right);
    }

    void in(Node node) {
        if (node == null) return;

        in(node.left);
        System.out.println(node.data);
        in(node.right);
    }

    void post(Node node) {
        if (node == null) return;

        post(node.left);
        post(node.right);
        System.out.println(node.data);
    }
}
