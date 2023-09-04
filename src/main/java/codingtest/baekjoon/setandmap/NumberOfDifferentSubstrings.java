package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/11478

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentSubstrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();

        String string = br.readLine();
        for (int i = 1; i <= string.length(); i++) {
            for (int j = 0; j < string.length()-i+1; j++) {
                set.add(string.substring(j, i+j));
            }
        }
        System.out.println(set.size());
    }
}
