package codingtest.baekjoon.function;

//https://www.acmicpc.net/problem/1065

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hansoo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        System.out.println(arithmeticSequence(num));
    }

    private static int arithmeticSequence(int num) {
        if(num <100){
            return num;
        }else{
            int cnt = 99;
            for (int i = 100; i <= num; i++) {
                int hundred = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if (hundred - ten == ten - one) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}
