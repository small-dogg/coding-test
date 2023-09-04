package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/2587

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MidValue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> dataList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int val = Integer.parseInt(br.readLine());
            dataList.add(val);
            sum += val;
        }
        Collections.sort(dataList);
        System.out.println(sum/5);
        System.out.println(dataList.get(2));
    }
}
