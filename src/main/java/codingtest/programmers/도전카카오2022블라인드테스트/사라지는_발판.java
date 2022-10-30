package codingtest.programmers.도전카카오2022블라인드테스트;

//92345
public class 사라지는_발판 {
    private static final int[] dx = {0, 0, -1, 1};
    private static final int[] dy = {-1, 1, 0, 0};

    //플레이어 좌표 클래스
    private static class Coord {
        public final int x;
        public final int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    //승리여부 및 이동횟수 클래스
    private static class Result {
        public final boolean win;
        public final int turns;

        public Result(boolean win, int turns) {
            this.win = win;
            this.turns = turns;
        }
    }

    //재귀
    private Result game(Coord player, Coord opponent
            , int[][] board) {
        //종료 조건 : 현재 위치에 발판이 없을 경우 패배
        if (board[player.y][player.x] == 0) {
            return new Result(false, 0);
        }

        //점화식
        boolean win = false;
        int winTurns = Integer.MAX_VALUE;
        int loseTurns = Integer.MIN_VALUE;

        board[player.y][player.x] = 0;
        for (int d = 0; d < 4; d++) {
            int nx = player.x + dx[d];
            int ny = player.y + dy[d];

            //배열범위를 벗어나거나
            if (ny < 0 || ny >= board.length
                    || nx < 0 || nx >= board[ny].length)
                continue;
            //발판이없는 경우를 필터링
            if (board[ny][nx] == 0)
                continue;

            Result result = game(opponent, new Coord(nx, ny), board);
            if (!result.win) {
                win = true;
                winTurns = Math.min(winTurns, result.turns);
            } else if (!win) {
                loseTurns = Math.max(loseTurns, result.turns);
            }
        }
        board[player.y][player.x] = 1;
        if (win) {
            return new Result(true, winTurns + 1);
        }

        if (loseTurns == Integer.MIN_VALUE) {
            return new Result(false, 0);
        }

        return new Result(false, loseTurns + 1);

    }

    public int solution(int[][] board, int[] aloc, int[] bloc) {
        return game(new Coord(aloc[1], aloc[0]), new Coord(bloc[1], bloc[0]), board).turns;
    }
}
