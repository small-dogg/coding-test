package codingtest.programmers.book.동적프로그래밍;

import java.util.Arrays;

public class 등굣길 {
    /**
     * 재귀 정의
     * 상태 : (x,y) 격자 (x,y)에서 출발하여 학교까지 가는 최단 경로의 개수
     * 종료 조건 : [x,y] 가 웅덩이 일때 = 0, (m+1,n) = (m, n+1) = 0 격자 밖을 벗어났을 때, (m,n) = 1 학교에 도착했을 때
     */

    public static void main(String[] args) {
        new 등굣길().solution(4, 3, new int[][]{{2, 2}});
    }

    private static final int[][] mem = new int[101][101];

    private int count(int x, int y, int w, int h, boolean[][] isPuddle) {

        if (isPuddle[y][x]) return 0;
        if (x > w || y > h) return 0;

        if (mem[x][y] != -1) return mem[x][y];

        if (x == w && y == h) return 1;

        int total = count(x + 1, y, w, h, isPuddle)
                + count(x, y + 1, w, h, isPuddle);
        return mem[x][y] = total % 1000000007;
    }

    public int solution(int m, int n, int[][] puddles) {

        for (int[] ints : mem) {
            Arrays.fill(ints, -1);
        }

        boolean[][] isPuddle = new boolean[n + 1][m + 1];
        for (int[] p : puddles) {
            isPuddle[p[1]][p[0]] = true;
        }

        return count(1, 1, m, n, isPuddle);
    }
}
