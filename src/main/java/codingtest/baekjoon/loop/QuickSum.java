package codingtest.baekjoon.loop;

import java.io.*;

public class QuickSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            String[] s = br.readLine().split(" ");
            bw.write(Integer.parseInt(s[0])+Integer.parseInt(s[1])+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
