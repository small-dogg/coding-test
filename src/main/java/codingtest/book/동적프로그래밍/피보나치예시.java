package codingtest.book.동적프로그래밍;

import java.util.Arrays;

public class 피보나치예시 {

    private static final long[] mem = new long[101];
    private static int calls = 0;

    public static void main(String[] args) {
        Arrays.fill(mem, -1);
        System.out.println(fibonacci(10));
        System.out.println(calls);
    }

    private static long fibonacci(int n) {
        calls++;

        if (mem[n] != -1) return mem[n];
        if (n == 0 || n == 1) return n;
        return mem[n] = fibonacci(n - 1) + fibonacci(n - 2);
    }
}
