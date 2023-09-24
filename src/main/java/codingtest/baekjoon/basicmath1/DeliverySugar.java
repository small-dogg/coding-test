package codingtest.baekjoon.basicmath1;

//https://www.acmicpc.net/problem/2839

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliverySugar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int data = 0;
        while (true) {
            if (n % 5 == 0) {
                System.out.println((n / 5) + data);
                break;
            } else {
                n -= 3;
                data++;
            }

            if (n < 0) {
                System.out.println(-1);
                break;
            }
        }
    }
}
