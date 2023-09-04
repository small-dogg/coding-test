package codingtest.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2739

public class GooGooDan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dan = Integer.parseInt(br.readLine());

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " * " + i + " = " + dan * i);
        }
    }
}
