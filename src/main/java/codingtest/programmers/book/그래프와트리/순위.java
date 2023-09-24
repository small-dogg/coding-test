package codingtest.programmers.book.그래프와트리;

public class 순위 {
    //한 선수가 이긴 선수들의 수를 세기 위해 화살표 방향으로 진행하며 만나는 정점 개수 세기
    //u: 정점,graph: 그래프, isVisited 방문 여부
    private int countForward(int u, boolean[][] graph, boolean[] isVisited) {
        int count = 1;

        //재귀 진행
        for (int v = 0; v < graph[u].length; v++) {
            //정점 v가 u와 연결된 간선이 없거나, 이전에 방문한 적이 있으면 스킵
            if(!graph[u][v] || isVisited[v]) continue;
            isVisited[v] = true;
            count += countForward(v, graph, isVisited);
        }

        return count;
    }

    private int countBackward(int u, boolean[][] graph, boolean[] isVisited) {
        int count = 1;

        //재귀 진행
        for (int v = 0; v < graph.length; v++) {
            //정점 v가 u와 연결된 간선이 없거나, 이전에 방문한 적이 있으면 스킵
            if(!graph[v][u] || isVisited[v]) continue;
            isVisited[v] = true;
            count += countBackward(v, graph, isVisited);
        }

        return count;
    }

    public int solution(int n, int[][] results) {
        int count = 0;
        boolean[][] graph = new boolean[n][n];
        //각 선수가
        for (int[] edge : results) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            graph[u][v] = true;
        }

        for (int u = 0; u < n; u++) {
            int wins = countForward(u, graph, new boolean[n]) - 1;//검사하는 선수도 포함하기때문에 -1
            int loses = countBackward(u, graph, new boolean[n]) - 1;

            if(wins + loses +1==n){
                count++;
            }
        }
        return count;
    }
}
