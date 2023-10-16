package codingtest.programmers.book.DFS;

import java.util.Stack;

public class 예제 {
    public void dfs(int N, int state) {
        // (1) 방문 검사 배열
        boolean[] isVisited = new boolean[N];

        Stack<Integer> stack = new Stack<>();
        //(2) 초기 상태
        stack.add(0);

        // (3) 탐색 진행
        while (!stack.isEmpty()) {

            // (4) 중복 검새
            if (isVisited[state]) continue;
            isVisited[state] = true;

            // (5) 현재 상태 처리
            /* 현재 상태 state 처리*/

            // (6) 전이 상태 생성
//            for (int next : getNextState(state)) {
//                 (7) 범위 검사
//                    if(!/* 범위 검사 조건 */){
                        //문제 범위를 벗어나는 상태는 제외합니다.
//                        continue;
//            }
//            (8) 유효성 검사
//            if (!/* 유효성 검사 조건*/){
//              //문제의 조건을 어기는 상태는 제외합니다.
//              continue;
//            }

//            //(9) 상태 전이
//            stack.push(next);
        }
    }
}
