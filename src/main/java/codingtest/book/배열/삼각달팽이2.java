package codingtest.book.배열;

public class 삼각달팽이2 {

    public static void main(String[] args) {
        삼각달팽이2 삼각달팽이2 = new 삼각달팽이2();
        int[] solution = 삼각달팽이2.solution(4);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    //dx, dy 는 x의 변화량, y의 변화량을 의미.
    //여기서 변화량은 특정 방향으로 이동할 때 해당 좌표값이 어떻게 변화하는지 의미.

    private static final int[] dx = {0, 1, -1};
    private static final int[] dy = {1, 0, -1};

    public int[] solution(int n) {

        int[][] triangle = new int[n][n];
        int x = 0;
        int y = 0;
        int d = 0;

        int v = 1;
        while (true) {

            triangle[y][x] = v++;

            // 진행방향으로 이동
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 진행방향으로 이동하였지만, 이미 값이 있거나 더이상 진행하지못했을 경우
            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                //방향을 바꿈 아래 -> 오른쪽 -> 위, 왼쪽
                d = (d + 1) % 3;
                nx = x + dx[d];
                ny = y + dy[d];

                //그럼에도 불구하고 진행이 불가하다는 것은 이미 가득차서 종료가 필요함을 의미
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                    break;
                }

            }
            x = nx;
            y = ny;
        }

        int[] result = new int[v-1];

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[index++] = triangle[i][j];
            }
        }

        return result;
    }
}
