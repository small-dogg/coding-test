package codingtest.baekjoon.conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2480

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[1]);
        int c = Integer.parseInt(strArr[2]);

        if ((a == b) && (b == c)) {
            System.out.println(10000 + a * 1000);
        } else if ((a == b) || (b == c) || (a == c)) {
            if ((a == b) || (a == c)) {
                System.out.println(1000 + a * 100);
            } else {
                System.out.println(1000 + b * 100);
            }
        } else {
            if ((a > b) && (a > c)) {
                System.out.println(a * 100);
            } else if (b > c) {
                System.out.println(b * 100);
            } else {
                System.out.println(c * 100);
            }
        }
    }
}
