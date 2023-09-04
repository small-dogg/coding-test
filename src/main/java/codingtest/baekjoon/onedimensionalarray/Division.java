package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/3052

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Division {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(integers.size());
    }
}
