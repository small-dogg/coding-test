package codingtest.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/5622

public class Dial {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int sum = 0;
        for (char c : chars) {
            int data;
            if(c>='P'&&c<='S'){
                data = 8;
            }else if(c>='T'&&c<='V'){
                data = 9;
            } else if (c >= 'W' && c <= 'Z') {
                data = 10;
            } else {
                data = (c - 65) / 3 + 3;
            }
            sum+= data;
        }
        System.out.println(sum);
    }
}
