package codingtest.programmers.book.유니온파인드;

public class 예제 {
    public static class Node {
        private int depth = 1;
        private Node parent = null;

        public boolean isConnected(Node o) {
            return root() == o.root();
        }

        public void merge(Node o) {
            //이미 연결되어있으면 반환
            if (isConnected(o)) return;

            Node root1 = root();
            Node root2 = o.root();

            if (root1.depth > root2.depth) {
                root2.parent = root1;
            } else if (root1.depth < root2.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1;
                root1.depth +=1;
            }
        }

        //노드가 연결된 최상단에 있는 조상을 반환
        private Node root() {
            if (parent == null) return this;
            return parent.root();
        }
    }

    //최적화 구현
    private static class Node2 {
        private Node2 parent = null;

        public boolean isConnected(Node2 o) {
            return root() == o.root();
        }

        public void merge(Node2 o) {
            if (isConnected(o)) return;
            o.parent = this;
        }

        private Node2 root() {
            if (parent == null) return this;
            return parent = parent.root();
        }
    }
}
