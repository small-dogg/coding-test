package codingtest.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/11021

public class SumWithString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 1; i <= length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            System.out.println("Case #"+i+": "+(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
        }
        br.close();
    }
}
