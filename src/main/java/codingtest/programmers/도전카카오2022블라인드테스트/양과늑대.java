package codingtest.programmers.도전카카오2022블라인드테스트;

import java.util.HashSet;
import java.util.Set;

public class 양과늑대 {
    /** 후보 노드 구하기
     * 1. 하나의 노드를 방문하여 후보 노드를 늘리고,
     * 2. 후보 노드를 순회하며 탐색
     *
     * node : 방문하려는 노드, nodes: 방문 후보 노드, tree
     */
    private Set<Integer> getNextNodes(int node, Set<Integer> nodes, boolean[][] tree) {
        //후보 방문노드 중 이번에 방문할 노드를 제외하고 다시 후보 방문노드를 구성
        Set<Integer> nextNodes = new HashSet<>(nodes);
        nextNodes.remove(node);

        //tree를 순회하며, node의 자식노드들 또한 후보 방문노드로 추가.
        for (int next = 0; next < tree[node].length; next++) {
            if(tree[node][next]) nextNodes.add(next);
        }

        return nextNodes;
    }

    /**
     * 완전 탐색 수행
     * 상태 변수
     * nodes: 후보노드
     * sheep: 양 수
     * wolf: 늑대 수
     * <p>
     * 종료 조건
     * ({}, sheep, wolf) = sheep : 더이상 방문할 수 있는 노드가 없을 때 현재까지 모은 양의 수
     */
    private int getMaxSheep(Set<Integer> nodes, int sheep, int wolf, int[] info, boolean[][] tree) {
        int maxSheep = sheep;

        for (int node : nodes) {
            int nextSheep = sheep;
            int nextWolf = wolf;

            if (info[node] == 0) {
                nextSheep += 1;
            } else {
                nextWolf += 1;
            }

            if(nextWolf >= nextSheep) continue;

            int s = getMaxSheep(getNextNodes(node, nodes, tree), nextSheep, nextWolf, info, tree);
            if (s > maxSheep) {
                maxSheep = s;
            }
        }

        return maxSheep;
    }

    public int solution(int[] info, int[][] edges) {
        //인접행렬 방식으로 트리 구성
        boolean[][] tree = new boolean[info.length][info.length];
        for (int[] edge : edges) {
            tree[edge[0]][edge[1]] = true;
        }

        Set<Integer> nodes = new HashSet<>();
        nodes.add(0);

        return getMaxSheep(nodes, 0, 0, info, tree);
    }
}
