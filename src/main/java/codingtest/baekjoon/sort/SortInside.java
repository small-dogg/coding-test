package codingtest.baekjoon.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//https://www.acmicpc.net/problem/1427
public class SortInside {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] value = br.readLine().toCharArray();
        List<Integer> data = new ArrayList<>();
        for (char c : value) {
            data.add(Character.getNumericValue(c));
        }

        Collections.sort(data, Comparator.reverseOrder());

        for (Integer num : data) {
            System.out.print(num);
        }
    }
}
