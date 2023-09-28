package codingtest.programmers.book.유니온파인드;

//42861
//최소 신장 트리(minimum spanning tree) - 간선을 가중치 순으로 정렬한 후 순서대로 순회하면서 연결되지 않은 두 정점을 잇는 간선을 채택 [크루스칼 알고리즘]

import java.util.Arrays;
import java.util.Comparator;

public class 섬연결하기 {
    private static class Node {
        private int depth = 1;
        private Node parent = null;

        public boolean isConnected(Node o) {
            return root() == o.root();
        }

        public void merge(Node o) {
            if (isConnected(o)) return;

            Node root1 = root();
            Node root2 = o.root();

            if (root1.depth > root2.depth) {
                root2.parent = root1;
            } else if (root1.depth < root2.depth) {
                root1.parent = root2;
            } else {
                root2.parent = root1;
                root1.depth += 1;
            }
        }

        private Node root() {
            if (parent == null) return this;
            return parent.root();
        }
    }

    private static class Edge {
        public final int u;
        public final int v;
        public final int cost;

        private Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    public int solution(int n, int[][] costs) {
        //간선의 비용 순으로 정렬
        Edge[] edges = Arrays.stream(costs)
                .map(edge -> new Edge(edge[0], edge[1], edge[2]))
                .sorted(Comparator.comparingInt(e -> e.cost))
                .toArray(Edge[]::new);

        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }

        //모든 간선을 순회하며 연결되어 있지 않은 간선을 이어주고 비용을 누적
        int totalCost = 0;
        for (Edge edge : edges) {
            Node node1 = nodes[edge.u];
            Node node2 = nodes[edge.v];

            if (node1.isConnected(node2)) continue;
            node1.merge(node2);
            totalCost += edge.cost;
        }

        return totalCost;
    }
}
