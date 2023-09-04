package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/10818

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val <= min) {
                min = val;
            }
            if (val >= max) {
                max = val;
            }
        }
        System.out.println(min + " " + max);
    }
}
