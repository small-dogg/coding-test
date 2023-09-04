package codingtest.baekjoon.IntegerAndCombinatorics;

//https://www.acmicpc.net/problem/1010

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bridge {

    static int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            sb.append(combi(m,n)).append("\n");
        }

        System.out.println(sb);
    }

    private static int combi(int n, int m) {
        if(dp[n][m] > 0) {
            return dp[n][m];
        }

        if(n == m || m == 0) {
            return dp[n][m] = 1;
        }

        return dp[n][m] = combi(n - 1, m - 1) + combi(n - 1, m);
    }
}
