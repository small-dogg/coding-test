package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/1764

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OffBrand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            stringList.add(br.readLine());
        }

        Collections.sort(stringList);

        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        for (String s : stringList) {

            if(set.contains(s)){
                cnt++;
                sb.append(s).append("\n");
            }
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
