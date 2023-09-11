package codingtest.book.해시;

//모든 점 사이의 기울기르 계산하여 같은 기울기가 있는지 확인
public class 평행 {

    public static void main(String[] args) {
        int[][] ints = {{1, 1}, {2, 2}, {3, 3}, {50, 100}};
        new 평행().solution(ints);
    }

//    책 풀이 잘못됨..
    //기울기 계산
//    private double getSlope(int x1, int y1, int x2, int y2) {
//        return (double) (y2 - y1) / (x2 - x1);
//    }

    //    public int solution(int[][] dots) {
//        Set<Double> slopes = new HashSet<>();
//
//        for (int i = 0; i < dots.length; i++) {
//            for (int j = i + 1; j < dots.length; j++) {
//                double slope = getSlope(dots[i][0], dots[i][1], dots[j][0], dots[j][1]);
//
//                if (slopes.contains(slope)) {
//                    return 1;
//                }
//
//                slopes.add(slope);
//            }
//        }
//        return 0;
//    }


    public int solution(int[][] dots) {
        int answer = 0;
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = dots[1][0];
        int y2 = dots[1][1];
        int x3 = dots[2][0];
        int y3 = dots[2][1];
        int x4 = dots[3][0];
        int y4 = dots[3][1];
        if ((double) Math.abs(y1 - y2) / Math.abs(x1 - x2) == (double) Math.abs(y3 - y4) / Math.abs(x3 - x4)) {
            answer = 1;
        } else if ((double) Math.abs(y1 - y3) / Math.abs(x1 - x3) == (double) Math.abs(y2 - y4) / Math.abs(x2 - x4)) {
            answer = 1;
        } else if ((double) Math.abs(y1 - y4) / Math.abs(x1 - x4) == (double) Math.abs(y2 - y3) / Math.abs(x2 - x3)) {
            answer = 1;
        }

        return answer;
    }
}
