package codingtest.baekjoon.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Star10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());
        cooking(val);
    }

    private static void cooking(int val) {

    }

    private static void printStar() {
        System.out.print("***");
        System.out.print("* *");
        System.out.print("***");
    }
}
