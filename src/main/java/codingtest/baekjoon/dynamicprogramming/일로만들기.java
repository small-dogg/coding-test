package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1463
public class 일로만들기 {

    static Integer[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        memo = new Integer[val + 1];
        memo[0] = memo[1] = 0;

        System.out.println(recursive(val));
    }

    private static int recursive(int n) {
        if (memo[n] == null) {
            if (n % 6 == 0) {
                memo[n] = Math.min(recursive(n - 1), Math.min(recursive(n / 3), recursive(n / 2))) + 1;
            } else if (n % 3 == 0) {
                memo[n] = Math.min(recursive(n - 1), recursive(n / 3)) + 1;
            } else if (n % 2 == 0) {
                memo[n] = Math.min(recursive(n - 1), recursive(n / 2)) + 1;
            } else {
                memo[n] = recursive(n - 1) + 1;
            }
        }
        return memo[n];
    }
}
