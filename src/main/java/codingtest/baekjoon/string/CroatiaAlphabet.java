package codingtest.baekjoon.string;

//https://www.acmicpc.net/problem/2941

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CroatiaAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.replaceAll("c=", "1");
        s = s.replaceAll("c-", "1");
        s = s.replaceAll("dz=", "1");
        s = s.replaceAll("d-", "1");
        s = s.replaceAll("lj", "1");
        s = s.replaceAll("nj", "1");
        s = s.replaceAll("s=", "1");
        s = s.replaceAll("z=", "1");
        System.out.println(s.length());
    }
}
