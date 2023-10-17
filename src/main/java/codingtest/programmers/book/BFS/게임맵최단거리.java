package codingtest.programmers.book.BFS;

import java.util.LinkedList;
import java.util.Queue;

//1844
public class 게임맵최단거리 {
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};

    //1. 상태 정의
    private static class State {
        public final int x;
        public final int y;
        public final int step;

        public State(int x, int y, int step) {
            this.x = x;
            this.y = y;
            this.step = step;
        }
    }

    public int solution(int[][] maps) {
        //2. 방문 검사 배열 - 2차원 배열에서 각 좌표의 방문 상태를 나타내는 방문 검사 배열을 맵 크기만큼 작성
        boolean[][] isVisited = new boolean[maps.length][maps[0].length];

        //3. 초기상태
        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0, 0, 1));

        //4. 탐색 진행
        while (!queue.isEmpty()) {
            State state = queue.poll();

            //5. 현재 상태 처리 - 골인 지점 도달시 반환
            if(state.y == maps.length-1 && state.x == maps[state.y].length-1){
                return state.step;
            }

            //6. 전이 상태 생성 - 모든 좌표에 대해 전이상태를 생성해야함
            for (int i = 0; i < 4; i++) {
                int nx = state.x + dx[i];
                int ny = state.y + dy[i];

                //7. 범위 검사 - 맵을 이탈했을 경우 스킵
                if (ny < 0 || ny >= maps.length || nx < 0 || nx >= maps[ny].length) {
                    continue;
                }

                //8. 유효성 검사 - 벽이 있을 경우, 전이 불가
                if (maps[ny][nx] != 1) {
                    continue;
                }

                //9. 방문 여부 확인
                if(isVisited[ny][nx]) continue;

                //10. 방문 처리 & 상태 전이
                isVisited[ny][nx] = true;
                queue.add(new State(nx, ny, state.step + 1));
            }
        }

        // 골에 도달할 수 없는 케이스
        return -1;
    }
}
