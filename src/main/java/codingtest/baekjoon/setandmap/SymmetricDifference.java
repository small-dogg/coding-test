package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/1269

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class SymmetricDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 0;
        Set<Integer> a = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            a.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            if (a.contains(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }

        System.out.println((n+m)-(cnt*2));
    }
}
