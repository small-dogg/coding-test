package codingtest.programmers.book.배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 교점에별만들기 {
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        String[] answer = {};

        // 1. 모든 직선 쌍에 대해 반복
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {

                // 1-A. 교점 좌표 구하기
                Point intersection = intersection(
                        line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]
                );

                // 1-B. 정수 좌표만 저장
                if (intersection != null) {
                    points.add(intersection);
                }
            }
        }

        //3. 각 x와 y의 최대 최소 크기를 통해 2차원 배열의 크기를 구함.
        Point minimum = getMinimumPoint(points);
        Point maximum = getMaximumPoint(points);

        int width = (int) (maximum.x - minimum.x + 1);
        int height = (int) (maximum.y - minimum.y + 1);

        char[][] arr = new char[width][height];

        for (char[] row : arr) {
            Arrays.fill(row, '.');
        }

        for (Point point : points) {
            int x = (int) (point.x - minimum.x);
            int y = (int) (maximum.y - point.y);
            arr[y][x] = '*';
        }

        String[] result = new String[arr.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }



        return answer;
    }

    //좌표를 나타내는 클래스
    private static class Point {
        public final long x, y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    //교점 좌표 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        /** 교점 구해서 반환하기
         *  a1 + b1 + c1
         *  a2 + b2 + c2
         * ---------------
         * -> x = (b1*c2 - b2*c1) /(a1*b2 - a2*b2), y = (a2*c1 - a1*c2)/(a1*b2 - a2*b2)
         **/
        double x = (double) (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b2);
        double y = (double) (a2 * c1 - a1 * c2) / (a1 * b2 - a2 * b2);

        if (x % 1 != 0 || y % 1 != 0) return null;

        return new Point((long) x, (long) y);
    }

    //2.저장된 정수들에 대해 x, y 좌표의 최솟값 구하기

    private Point getMinimumPoint(List<Point> points) {
        //가장 작은 좌표 구하기
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;

        for (Point point : points) {
            if (point.x < x) x = point.x;
            if (point.y < y) y = point.y;
        }

        return new Point(x, y);
    }

    // 저장된 정수들에 대해 x, y 좌표의 최댓값 구하기
    private Point getMaximumPoint(List<Point> points) {
        //가장 큰 좌표 구하기
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;

        for (Point point : points) {
            if (point.x > x) x = point.x;
            if (point.y > y) y = point.y;
        }

        return new Point(x, y);
    }

}
