package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/4153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String read = br.readLine();
            if (read.equals("0 0 0")) break;

            String[] s = read.split(" ");
            double pow1 = Math.pow(Integer.parseInt(s[0]), 2);
            double pow2 = Math.pow(Integer.parseInt(s[1]), 2);
            double pow3 = Math.pow(Integer.parseInt(s[2]), 2);

            if (pow1 + pow2 == pow3) {
                sb.append("right").append("\n");
            } else if (pow1 == pow2 + pow3) {
                sb.append("right").append("\n");
            } else if (pow1 + pow3 == pow2) {
                sb.append("right").append("\n");
            } else {
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
    }
}
