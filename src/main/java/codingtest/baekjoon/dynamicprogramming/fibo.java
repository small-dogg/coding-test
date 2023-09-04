package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(val)+" "+(val-2));
    }
    private static int fib(int n){
        if(n==1 || n ==2) {
            return 1;
        }else{
            return (fib(n - 1) + fib(n - 2));
        }
    }

    private static int fibonacci(int n) {
        int[] fibos = new int[n + 1];
        fibos[1]=fibos[2]=1;
        for (int i = 3; i < n; i++) {
            fibos[i] = fibos[i - 1] + fibos[i - 2];
        }
        return fibos[n];
    }
}
