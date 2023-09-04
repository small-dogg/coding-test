package codingtest.baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StringSet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        int val = 0;

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            String s1 = br.readLine();
                if(set.contains(s1)) {
                    val++;
                }
        }
        System.out.println(val);

    }
}
