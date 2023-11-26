package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11726
public class n타일링 {
    static int[] data = new int[1001];
    public static void main(String[] args) throws IOException {
        data[0] = 1;
        data[1] = 2;
        for (int i = 2; i <1001; i++) {
            data[i] = (data[i - 1] + data[i - 2])%10007;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(data[Integer.parseInt(br.readLine())-1]);
    }
}
