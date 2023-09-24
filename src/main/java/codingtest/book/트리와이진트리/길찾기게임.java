package codingtest.book.트리와이진트리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 길찾기게임 {
    private static class Node {
        private final int value;
        private final int x;
        private final int y;

        public Node left;
        public Node right;

        public Node(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }

    private void pre(Node node, List<Integer> visits) {
        if (node == null) return;

        visits.add(node.value);
        pre(node.left, visits);
        pre(node.right, visits);
    }

    private void post(Node node, List<Integer> visits) {
        if (node == null) return;

        post(node.left, visits);
        post(node.right, visits);
        visits.add(node.value);
    }

    private void insert(Node root, Node node) {
        // x좌표에 따라 root 노드가 나타내는 트리에 node 삽입

        if (node.x < root.x) {
            //root보다 좌측에 존재하므로 왼쪽 서브 트리에 삽입

            //root의 왼쪽 서브트리가 비어있다면 왼쪽 서브트리의 루트 노드로 삽입
            if (root.left == null) {
                root.left = node;
            } else { // 그렇지 않다면, 자신의 위치를 찾을 수 있도록 재귀 호출
                insert(root.left, node);
            }
        } else {
            //오른쪽 서브 트리에 삽입
            if (root.right == null) {
                root.right = node;
            } else {
                insert(root.right, node);
            }
        }
    }

    private Node constructTree(Node[] nodes) {
        //정렬된 첫 번째는 루트 노드
        Node root = nodes[0];

        for (int i = 1; i < nodes.length; i++) {
            insert(root, nodes[i]);
        }

        return root;
    }

    public int[][] solution(int[][] nodeInfo) {
        Node[] nodes = new Node[nodeInfo.length];

        //전달받은 노드정보를 Node 객체로 변환
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(i + 1, nodeInfo[i][0], nodeInfo[i][1]);
        }

        //트리의 윗부분 부터 순회하기 위해 y값을 기준으로 내림차순 정렬
        Arrays.sort(nodes, (a, b) -> b.y - a.y);

        Node root = constructTree(nodes);

        List<Integer> preorder = new ArrayList<>();
        pre(root, preorder);

        List<Integer> postorder = new ArrayList<>();
        post(root, postorder);

        return new int[][]{
                preorder.stream().mapToInt(Integer::intValue).toArray(),
                postorder.stream().mapToInt(Integer::intValue).toArray()
        };
    }
}
