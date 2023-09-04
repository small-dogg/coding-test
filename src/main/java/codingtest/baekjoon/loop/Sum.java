package codingtest.baekjoon.loop;

//https://www.acmicpc.net/problem/8393

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        int val = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int res = (val+1)*(val/2);
        if(val%2!=0) {
            res+=val/2+1;
        }
        System.out.println(res);
    }
}
