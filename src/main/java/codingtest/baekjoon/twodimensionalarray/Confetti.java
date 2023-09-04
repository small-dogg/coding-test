package codingtest.baekjoon.twodimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2563

public class Confetti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int sum = 0;
        boolean[][] ints = new boolean[100][100];
        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    ints[j][k] = true;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if(ints[i][j]){
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
