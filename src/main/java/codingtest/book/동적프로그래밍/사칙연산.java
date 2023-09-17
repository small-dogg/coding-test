package codingtest.book.동적프로그래밍;

import java.util.Arrays;

public class 사칙연산 {

    public static void main(String[] args) {
        new 사칙연산().solution(new String[]{"1", "-", "3", "+", "5", "-", "8"});
    }

    private final int[][] maxMem = new int[202][202];
    private final int[][] minMem = new int[202][202];

    /**
     * 상태 : max(start, end), 연산식의 [start, end) 범위에서 나올 수 있는 최대 연산 결과
     * 종료 조건 max(start, start + 1) = [start],  범위에 하나의 숫자만 있을 때는 해당 숫자 반환
     */
    private int max(int start, int end, String[] arr) {
        if (maxMem[start][end] != Integer.MIN_VALUE) return maxMem[start][end];
        if (end - start == 1) return Integer.parseInt(arr[start]);

        int max = Integer.MIN_VALUE;
        for (int i = start + 1; i < end; i += 2) {
            int l = max(start, i, arr);
            int v;
            if (arr[i].equals("+")) {
                int r = max(i + 1, end, arr);
                v = l + r;
            } else {
                int r = min(i + 1, end, arr);
                v = l - r;
            }
            if (v > max) max = v;
        }
        return maxMem[start][end] = max;
    }

    /**
     * 상태 : min(start, end), 연산식의 [start,end) 범위에서 나올 수 있는 최소 연산 결과
     * 종료 조건 : min(start, start + 1) = [start], 범위에 하나의 숫자만 있을 때는 해당 숫자 반환
     */
    private int min(int start, int end, String[] arr) {
        if (minMem[start][end] != Integer.MAX_VALUE) return minMem[start][end];
        if (end - start == 1) return Integer.parseInt(arr[start]);

        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i < end; i += 2) {
            int l = min(start, i, arr);
            int v;
            if (arr[i].equals("+")) {
                int r = min(i + 1, end, arr);
                v = l + r;
            } else {
                int r = max(i + 1, end, arr);
                v = l - r;
            }
            if (v < min) min = v;

        }
        return minMem[start][end] = min;

    }

    public int solution(String[] arr) {
        for (int i = 0; i < maxMem.length; i++) {
            Arrays.fill(maxMem[i], Integer.MIN_VALUE);
            Arrays.fill(minMem[i], Integer.MAX_VALUE);
        }

        return max(0, arr.length, arr);
    }
}
