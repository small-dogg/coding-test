package codingtest.programmers.book.동적프로그래밍;

import java.util.Arrays;

public class 피보나치수 {
    private static int[] mem = new int[100001];

    private int fibonacci(int n) {
        if (mem[n] != -1) return mem[n];
        if (n == 0 || n == 1) return n;

        return mem[n] = (fibonacci(n - 1) + fibonacci(n - 2)) % 1234567;
    }

    public int solution(int n) {
        Arrays.fill(mem, -1);

        for (int i = 0; i <= n; i++) {
            fibonacci(n);
        }
        return fibonacci(n);
    }

    public int solution2(int n) {
        int[] num = new int[n + 1];

        num[0] = 0;
        num[1] = 1;

        for (int i = 2; i <= n; i++) {
            num[i] = (num[i - 1] + num[i - 2]) % 1234567;
        }

        return num[n] % 1234567;
    }
}
