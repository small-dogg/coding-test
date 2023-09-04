package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/10816

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NumberCard2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int val = Integer.parseInt(st.nextToken());
            map.put(val, map.getOrDefault(val, 0)+1);
        }
        br.readLine();

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreElements()) {
            int val = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(val, 0)).append(" ");
        }

        System.out.println(sb);

    }
}
