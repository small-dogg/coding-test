package codingtest.baekjoon.loop;

import java.io.*;

//https://www.acmicpc.net/problem/2438

public class Star2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            for (int j = length-i-1; j > 0 ; j--) {
                bw.write(" ");
            }
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
