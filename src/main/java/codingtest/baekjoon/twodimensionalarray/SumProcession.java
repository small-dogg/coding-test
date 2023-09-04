package codingtest.baekjoon.twodimensionalarray;

//https://www.acmicpc.net/problem/2738

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumProcession {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int[][] data = new int[x][y];

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                data[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < y; j++) {
                System.out.print(data[i][j]+Integer.parseInt(st.nextToken())+" ");
            }
            System.out.println();
        }
        br.close();
    }
}
