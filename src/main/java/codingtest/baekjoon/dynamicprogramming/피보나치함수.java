package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치함수 {
    static int zeroCount = 0;
    static int oneCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            fibo(Integer.parseInt(br.readLine()));

            sb.append(zeroCount).append(" ").append(oneCount).append("\n");
            zeroCount = 0;
            oneCount = 0;
        }
        System.out.println(sb);

    }

    private static void fibo(int n) {
        int temp1 = 0;
        int temp2 = 1;
        int temp;
        if(n==0) {
            zeroCount++;
        } else if(n== 1) {
            oneCount++;
        }        else {
            for(int i = 1 ; i < n ; i++) {
                temp = temp1 + temp2;
                temp1 = temp2;
                temp2 = temp;
            }
            zeroCount = temp1;
            oneCount = temp2;
        }

    }
}
