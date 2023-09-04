package codingtest.baekjoon.bruteforce;

//https://www.acmicpc.net/problem/1436

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SHHOM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int val = 1;
        int idx = 666;
        while (n != val) {
            idx++;
            if(String.valueOf(idx).contains("666")){
                val++;
            }
        }
        System.out.println(idx);
    }
}
