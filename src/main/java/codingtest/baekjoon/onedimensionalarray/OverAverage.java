package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/4344

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            int sum = 0;
            int[] studentPoints = new int[studentNum];
            for (int j = 0; j < studentNum; j++) {
                int val = Integer.parseInt(st.nextToken());
                sum += val;
                studentPoints[j] = val;
            }
            float average = (float)sum / studentNum;
            int over = 0;
            for (int studentPoint : studentPoints) {
                if (studentPoint > average) {
                    over++;
                }
            }
            System.out.println(String.format("%.3f%%",(float)over*100/studentNum));
        }
    }
}
