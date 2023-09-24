package codingtest.programmers.book.동적프로그래밍;

import java.util.Arrays;

public class 정수삼각형 {
    /**
     * 재귀 정의
     * 상태 : (x, y) 삼각형의 xm y에 위치한 꼭지점에서 출발했을 때 거쳐 가는 숫자의 최대값
     * 종료조건 : (x, H) = 0 삼각형 끝에 도달하면 더이상 더할 숫자가 없으므로 0을 반환하고 종료
     */

    private final int[][] mem = new int[501][501];

    private int max(int x, int y, int[][] triangle) {
        if(mem[x][y]!= -1) return mem[x][y];
        if( y == triangle.length) return 0;

        return mem[x][y] = triangle[y][x] + Math.max(max(x, y + 1, triangle), max(x + 1, y + 1, triangle));
    }

    public int solution(int[][] triangle) {
        for (int[] ints : mem) {
            Arrays.fill(ints, -1);
        }

        return max(0, 0, triangle);
    }
}
