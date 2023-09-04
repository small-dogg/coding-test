package codingtest.baekjoon.IntegerAndCombinatorics;

//https://www.acmicpc.net/problem/1037

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = 1000000;
        int max = 2;
        while (st.hasMoreElements()) {
            int val = Integer.parseInt(st.nextToken());
            min = Math.min(min, val);
            max = Math.max(max, val);
        }
        System.out.println(min * max);
    }
}
