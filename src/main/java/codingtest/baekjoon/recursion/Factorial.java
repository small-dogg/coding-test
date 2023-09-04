package codingtest.baekjoon.recursion;

//https://www.acmicpc.net/problem/10872

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int fac = Integer.parseInt(br.readLine());

        System.out.println(factorial(fac));

    }

    private static int factorial(int fac){
        if(fac<1){
            return 1;
        }
        return fac * (factorial(fac - 1));
    }
}
