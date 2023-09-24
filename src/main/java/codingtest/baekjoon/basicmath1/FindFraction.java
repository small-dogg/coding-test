package codingtest.baekjoon.basicmath1;

//https://www.acmicpc.net/problem/1193

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());

        int i = 0;
        int val = 0;
        while (true) {
            i++;
            val += i;
            if (val >= data) {
                if (i % 2 == 0) {
                    System.out.println(data - val + i + "/" + (val - data + 1));
                } else {
                    System.out.println((val - data + 1) + "/" + (data - val + i));
                }
                break;
            }
        }
    }
}
