package codingtest.book.재귀;

public class 제곱재귀 {
    private int power(int n, int m) {
        //종료 최소 조건
        if(n == 0 || n== 1 || m==0) return 1;

        //점화식
        return n * power(n,m - 1);
    }
}
