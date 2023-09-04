package codingtest.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            String[] s1 = br.readLine().split(" ");
            System.out.println(Integer.parseInt(s1[0]) + Integer.parseInt(s1[1]));
        }
    }
}
