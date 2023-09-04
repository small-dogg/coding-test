package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/25305

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CutLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());
        sb.nextToken();
        int k = Integer.parseInt(sb.nextToken());

        List<Integer> dataList = new ArrayList<>();

        sb = new StringTokenizer(br.readLine());
        while(sb.hasMoreTokens()){
            dataList.add(Integer.parseInt(sb.nextToken()));
        }

        Collections.sort(dataList, Comparator.reverseOrder());

        System.out.println(dataList.get(k-1));

    }
}
