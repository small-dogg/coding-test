package codingtest.baekjoon.bruteforce;

//https://www.acmicpc.net/problem/2231

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecompositionSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n ; i++) {
            int data = i;
            int val=0;
            while(data>0){
                val += data%10;
                data/=10;
            }
            if(val+i==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}
