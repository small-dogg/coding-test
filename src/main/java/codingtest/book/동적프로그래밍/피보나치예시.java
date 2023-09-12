package codingtest.book.동적프로그래밍;

public class 피보나치예시 {

    private static int calls = 0;

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(calls);
    }

    private static long fibonacci(int n) {
        calls++;
        if (n == 0 || n == 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
