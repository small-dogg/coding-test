package codingtest.tip;

/**
 * AVL(Adelson-Velsky and Landis) 트리는 자가 균형 이진 트리이다.
 * 자가 균형 트리는 삽입과 삭제가 일어날 때, 밸런싱 규칙에 따라 높이를 배런싱하는 이진 트리이다.
 * BST의 Worst 시간 복잡도는 트리의 높이에 따른다. 즉, 루트로부터 가장 긴 경로에 존재하는 노드를 의미한다.
 */
public class AVL {

    private Node root;

    void updateHeight(Node n) {
        n.height = 1 + Math.max(height(n.left), height(n.right));
    }

    int height(Node n) {
        return n == null ? -1 : n.height;
    }

    int getBalance(Node n) {
        return (n == null) ? 0 : height(n.right) - height(n.left);
    }

    Node rotateRight(Node y) {
        Node x = y.left;
        Node z = x.right;

        x.right = y;
        y.left = z;
        updateHeight(y);
        updateHeight(x);

        return x;
    }

    Node rotateLeft(Node y) {
        Node x = y.right;
        Node z = x.left;

        x.left = y;
        y.right = z;

        updateHeight(y);
        updateHeight(x);
        return x;
    }

    Node rebalance(Node z) {
        updateHeight(z);
        int balance = getBalance(z);
        if (balance > 1) {
            if (height(z.right.right) > height(z.right.left)) {
                z = rotateLeft(z);
            } else {
                z.right = rotateRight(z.right);
                z = rotateLeft(z);
            }
        } else if (balance < -1) {
            if (height(z.left.left) > height(z.left.right)) {
                z = rotateLeft(z.left);
            } else {
                z.left = rotateLeft(z.left);
                z = rotateRight(z);
            }
        }

        return z;
    }

    Node delete(Node node, int key) {
        if (node == null) {
            return node;
        } else if (node.key > key) {
            node.left = delete(node.left, key);
        } else if (node.key < key) {
            node.right = delete(node.right, key);
        } else {
            if (node.left == null || node.right == null) {
                node = (node.left == null) ? node.right : node.left;
            } else {
                Node mostLeftChild = mostLeftChild(node.right);
                node.key = mostLeftChild.key;
                node.right = delete(node.right, node.key);
            }
        }
        if (node != null) {
            node = rebalance(node);
        }
        return node;
    }

    private Node mostLeftChild(Node node) {
        Node current = node;
        /* loop down to find the leftmost leaf */
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    Node find(int key) {
        Node current = root;
        while (current != null) {
            if (current.key == key) {
                break;
            }
            current = current.key < key ? current.right : current.left;
        }
        return current;
    }

    public class Node {
        int key;
        int height;
        Node left;
        Node right;
    }
}
