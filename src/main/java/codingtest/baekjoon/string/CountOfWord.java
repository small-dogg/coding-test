package codingtest.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/1152

public class CountOfWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().trim().split(" ");
        if(s.length == 1 && s[0].equals("")) {
            System.out.println(0);
        }else {
            System.out.println(s.length);
        }
    }
}
