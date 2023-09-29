package codingtest.programmers.book.유니온파인드;
//64063

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 한번에 한명씩 신청한 순서대로 배정
 * 투숙하기를 원하는 번호를 제출하고 방이 비어있을 경우 할당
 * 비어있지 않을 경우, 원하는 방번호보다 크면서 비어있는 방 중 가장 번호가 작은 방을 배정
 * <p>
 * room_number <200001, k <1013
 */
public class 호텔방배정 {
    public static class Node {
        private int depth = 1;
        private Node parent = null;

        private long max;

        public Node(long value) {
            this.max = value;
        }

        public boolean isConnected(Node o) {
            return root() == o.root();
        }

        public long max() {
            return root().max;
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
                root1.depth += 1;
            }

            root1.max = root2.max = Math.max(root1.max, root2.max);
        }

        //노드가 연결된 최상단에 있는 조상을 반환
        private Node root() {
            if (parent == null) return this;
            return parent.root();
        }
    }

    public long[] solution(int k, int[] roomNumber) {
        List<Long> assigned = new ArrayList<>();

        //유니온 파인드 수행
        Map<Long, Node> nodes = new HashMap<>();

        for (long number : roomNumber) {
            if (nodes.containsKey(number)) {
                number = nodes.get(number).max() + 1;
            }

            //number 방 실제 배정하기
            Node node = new Node(number);
            nodes.put(number, node);

            if (nodes.containsKey(number - 1)) {
                node.merge(nodes.get(number - 1));
            }
            if (nodes.containsKey(number + 1)) {
                node.merge(nodes.get(number + 1));
            }

            assigned.add(number);
        }

        return assigned.stream().mapToLong(Long::longValue).toArray();
    }
}
