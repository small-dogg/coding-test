package codingtest.baekjoon.bruteforce;

//https://www.acmicpc.net/problem/2798

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        st.nextToken();
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.reverseOrder());

        int result = 0;
        for (int i = 0; i < list.size() - 2; i++) {
            for (int j = i + 1; j < list.size() - 1; j++) {
                for (int k = j + 1; k < list.size(); k++) {
                    int sum = list.get(i) + list.get(j) + list.get(k);
                    if (sum <= m && sum > result) {
                        result = sum;
                    }
                    if(sum==m) break;
                }
            }
        }
        System.out.println(result);
    }
}
