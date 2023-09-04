package codingtest.tip;

public class 피보나치수열3 {
    public static void main(String[] args) {
     solution(10);
    }

    static void solution(int n) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
