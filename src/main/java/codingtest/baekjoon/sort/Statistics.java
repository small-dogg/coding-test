package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/2108

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] arr = new int[8001];

        int sum = 0;
        int max = -4000;
        int min = 4000;
        int median = 10000;
        int mode = 10000;

        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(br.readLine());
            sum += val;
            arr[val + 4000]++;

            if (max < val) {
                max = val;
            }
            if (min > val) {
                min = val;
            }
        }

        int count = 0;
        int modeMax = 0;

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (count < (length + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                if (modeMax < arr[i]) {
                    modeMax = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if (modeMax == arr[i] && flag) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int) Math.round((double) sum / length));
        System.out.println(median);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
