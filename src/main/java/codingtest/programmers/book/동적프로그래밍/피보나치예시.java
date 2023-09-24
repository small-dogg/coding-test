package codingtest.programmers.book.동적프로그래밍;

import java.util.Arrays;

public class 피보나치예시 {

    private static final long[] mem = new long[11];
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

    private static long iterativeFibonacci(int n) {
        long[] mem = new long[n + 1];
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 0; i < n - 1; i++) {
            mem[i + 1] += mem[i];
            if(i+2 < mem.length) mem[i + 2] += mem[i];
        }

        return mem[n];
    }
}
