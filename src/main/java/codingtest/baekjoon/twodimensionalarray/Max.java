package codingtest.baekjoon.twodimensionalarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2566

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int[][] ints = new int[9][9];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                int val = Integer.parseInt(st.nextToken());
                ints[i][j] = val;
                if(val>max) max = val;
            }
        }

        System.out.println(max);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(ints[i][j] ==max){
                    System.out.println(i+1);
                    System.out.println(j+1);
                }
            }
        }

    }
}
