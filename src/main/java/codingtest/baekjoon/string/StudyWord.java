package codingtest.baekjoon.string;

//https://www.acmicpc.net/problem/1157

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudyWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toUpperCase().toCharArray();

        int[] ints = new int[26];
        for (char c : chars) {
            ints[c - 65]++;
        }

        int max = 0;
        char ch = '?';
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
                ch = (char) (i + 65);
            }else if(ints[i]==max){
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
