package codingtest.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.acmicpc.net/problem/2750
public class SortNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        List<Integer> dataList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            dataList.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(dataList);

        for (Integer integer : dataList) {
            System.out.println(integer);
        }
    }
}
