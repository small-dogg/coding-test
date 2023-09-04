package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/1546

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sum = 0;
        int[] ints = new int[length];
        for (int i = 0; i < length; i++) {
            ints[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ints);
        int max = ints[ints.length - 1];
        for (int anInt : ints) {
            sum+=(float)anInt/max*100;
        }
        System.out.println(sum/length);
    }
}
