package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/10815

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NumberCard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        Set<String> set = new HashSet<>();

        while (st.hasMoreElements()) {
            set.add(st.nextToken());
        }
        br.readLine();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            String s = st.nextToken();
            sb.append(set.contains(s)?1:0).append(" ");
        }
        System.out.println(sb);

    }
}
