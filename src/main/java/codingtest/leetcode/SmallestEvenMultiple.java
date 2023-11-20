package codingtest.leetcode;

public class SmallestEvenMultiple {
    public int smallestEvenMultiple(int n) {
        while (n % 2 == 0) {
            n *= 2;
        }
        return n;
    }
}
