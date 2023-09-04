package codingtest.baekjoon.IntegerAndCombinatorics;

//https://www.acmicpc.net/problem/1934

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Lcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int length = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(lcm(a, b)).append("\n");
        }

        System.out.print(sb);
    }
    static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
