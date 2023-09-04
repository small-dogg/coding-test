package codingtest.baekjoon.string;

//https://www.acmicpc.net/problem/11720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] split = br.readLine().split("");
        int sum = 0;
        for (String s : split) {
            sum+=Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
