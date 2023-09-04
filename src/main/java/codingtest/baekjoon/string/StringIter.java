package codingtest.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/2675

public class StringIter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int iter = Integer.parseInt(st.nextToken());
            char[] chars = st.nextToken().toCharArray();
            for (char aChar : chars) {
                for (int j = 0; j < iter; j++) {
                    sb.append(aChar);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
