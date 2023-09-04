package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/2477

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MelonFarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int melon = Integer.parseInt(br.readLine());

        int xMax = 0;
        int yMax = 0;

        int[] ints = new int[6];

        int smallXIdx = 0;
        int smallYIdx = 0;
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int val = Integer.parseInt(st.nextToken());

            ints[i] = val;

            if (i % 2 == 0) {
                if (val > xMax) {
                    xMax = val;
                    smallXIdx = i + 3;
                }
            } else {
                if (val > yMax) {
                    yMax = val;
                    smallYIdx = i + 3;
                }
            }

        }
        int bigSquare = xMax * yMax;
        int smallSquare = ints[smallXIdx % 6] * ints[smallYIdx % 6];
        System.out.println((bigSquare - smallSquare) * melon);
    }
}
