package codingtest.baekjoon.string;

//https://www.acmicpc.net/problem/2908

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sangsoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuffer(st.nextToken()).reverse().toString());

        System.out.println(Math.max(a, b));
    }
}
