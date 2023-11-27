package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB거리 {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] cost;
    static int[][] dp;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        dp = new int[n][3];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine(), " ");

            cost[i][Red] = Integer.parseInt(st.nextToken());
            cost[i][Green] = Integer.parseInt(st.nextToken());
            cost[i][Blue] = Integer.parseInt(st.nextToken());
        }

        dp[0][Red] = cost[0][Red];
        dp[0][Green] = cost[0][Green];
        dp[0][Blue] = cost[0][Blue];

        System.out.println(
                Math.min(
                        getCost(n - 1, Red),
                        Math.min(
                                getCost(n - 1, Green), getCost(n - 1, Blue))));

    }

    static int getCost(int n, int color) {

        if (dp[n][color] == 0) {


            if (color == Red) {
                dp[n][Red] = Math.min(getCost(n - 1, Green), getCost(n - 1, Blue)) + cost[n][Red];
            }
            else if (color == Green) {
                dp[n][Green] = Math.min(getCost(n - 1, Red), getCost(n - 1, Blue)) + cost[n][Green];
            }
            else {
                dp[n][Blue] = Math.min(getCost(n - 1, Red), getCost(n - 1, Green)) + cost[n][Blue];
            }

        }

        return dp[n][color];
    }
}
