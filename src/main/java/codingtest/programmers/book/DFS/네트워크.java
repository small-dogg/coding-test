package codingtest.programmers.book.DFS;

import java.util.Stack;

//43162

// 연결되어있는 것들은 한 visitAll 호출 안에서 모두 연결하고, 이를 방문 노드로 처리하여, 재 호출하지 아니하여
// 재귀함수를 호출한 횟수만큼(서로 연결되지 않은 노드 뭉태기 만큼 돌게 되어있음. 사전에 미리 다 연결을 하기 때문에)을 결과로 반환
public class 네트워크 {
    private void visitAll(int computer, int[][] computers, boolean[] isVisited) {

        //2. 초기상태
        Stack<Integer> stack = new Stack<>();
        stack.push(computer);

        //3. 탐색 진행
        while (!stack.isEmpty()) {
            int c = stack.pop();

            //4. 중복 검사
            //1. 방문 배열 검사
            if(isVisited[c]) continue;
            isVisited[c] = true;

            //6. 전이 상태 생성
            for (int next = 0; next < computers[c].length; next++) {
                //7. 유효성 검사
                if(computers[c][next] == 0) continue; // 연결되어있지 않으면 연결할 필요 없음
                stack.push(next);
            }
        }
    }

    public int solution(int n, int[][] computers) {
        boolean[] isVisited = new boolean[n]; // 방문 노드 체크
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if(isVisited[i]) continue;
            visitAll(i, computers, isVisited);
            answer++;
        }
        return answer;
    }
}
