package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/18870

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CoordCompression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        Integer[] arr = new Integer[length];
        Integer[] sort = new Integer[length];
        Map<Integer, Integer> map = new LinkedHashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(st.nextToken());
            arr[i] = val;
            sort[i] = val;
        }
        Arrays.sort(sort);

        int idx = 0;
        for (Integer integer : sort) {
            if (!map.containsKey(integer)) {
                map.put(integer, idx);
                idx++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(map.get(i)).append(" ");
        }
        System.out.println(sb);
    }
}
