package codingtest.programmers.book.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {
    //매개로 제공되는 두 단어는 하나의 문자만 다를 때 변환될 수 있음
    private boolean isConvertable(String src, String dst) {
        char[] srcArr = src.toCharArray();
        char[] dstArr = dst.toCharArray();

        int diff = 0;
        for (int i = 0; i < srcArr.length; i++) {
            if(srcArr[i]!=dstArr[i]) diff++;
        }

        return diff == 1;
    }

    //1. 상태 정의
    private static class State {
        public final String word;
        public final int step; // 변환 횟수

        public State(String word, int step) {
            this.word = word;
            this.step = step;
        }
    }
    public int solution(String begin, String target, String[] words) {
        // 2. 방문 검사 배열
        boolean[] isVisited = new boolean[words.length];

        // 3. 초기 상태
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(begin, 0));

        // 4. 탐색 진행
        while (!queue.isEmpty()) {
            State state = queue.poll();

            //5. 현재 상태 처리 - 해당 상태에 있는 단어가 target과 같으면 정답 상태에 도달했으므로 횟수 반환
            if (state.word.equals(target)) {
                return state.step;
            }

            //6. 전이 상태 생성 - 정답이 아니라면 단어를 변환시켜 상태 전이를 수행(모든 단어를 순회하여 전이할 수 있는 단어를 선별)
            for (int i = 0; i < words.length; i++) {
                String next = words[i];

                //상태 전이 검사 및 상태 전이
                //7. 유효성 검사 - isConvertable 메서드를 활용 하여, 변환 가능 여부를 체크
                if (!isConvertable(state.word, next)) {
                    continue;
                }

                //8. 중복 검사 - 이미 방문 이력이 있는 단어의 경우 스킵
                if (isVisited[i]) {
                    continue;
                }

                //9. 방문 처리 및 상태 전이
                isVisited[i] = true;
                queue.add(new State(next, state.step + 1));
            }
        }
        //변환이 불가능하기때문에 0으로 반환
        return 0;
    }
}
