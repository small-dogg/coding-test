package codingtest.leetcode;

public class SqrtX {

    public static void main(String[] args) {
        new SqrtX().mySqrt(4);
    }

    public int mySqrt(int x) {
        if (x < 2) return x;
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
}
