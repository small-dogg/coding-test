package codingtest.programmers.book.DFS;

import java.util.Stack;

//43165
public class 타겟넘버 {
    private static class State {

        public final int index; // 연선자를 결정할 index 위치
        public final int acc; // 현재까지 결정된 연산자로 결정된 값

        public State(int index, int acc) {
            this.index = index;
            this.acc = acc;
        }
    }

    public int solution(int[] numbers, int target) {

        //1. 방문 검사 배열 (필요없음)

        //2. 초기 상태
        Stack<State> s = new Stack<>();
        s.push(new State(0, 0));

        //3. 탐색 진행
        int count = 0;
        while (!s.isEmpty()) {
            State state = s.pop();

            //state 처리, 전이

            //4. 중복검사 (중복 없음)

            //5. 현재 상태 처리
            if (state.index == numbers.length) {
                if(state.acc == target) count ++;
                continue;
            }

            //6.전이 상태 생성
            //연산자를 +로 선택한 경우
            State state1 = new State(state.index + 1, state.acc - numbers[state.index]);
            //연산자를 -로 선택한 경우
            State state2 = new State(state.index + 1, state.acc + numbers[state.index]);

            //7. 범위 검사(연산중 나올 수 있는 값에 대한 별도의 범위가 정해져 있지 않기 때문에 범위검사 필요 없음

            //8. 유효성 검사(연산중 나올 수 있는 값은 모든 정수로 유효한 값이기때문에 유효성 검사 필요 없음 )

            //9. 상태 전이
            s.push(state1);
            s.push(state2);
        }

        return count;
    }
}

class Solution2 {
    int result = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        dfs(numbers, 0, target, 0);
        return result;
    }

    private void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) {
            if (sum == target) result++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]);
            dfs(numbers, depth + 1, target, sum - numbers[depth]);
        }
    }
}