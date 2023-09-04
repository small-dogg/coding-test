package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/2751

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//https://st-lab.tistory.com/104 Counting Sort : O(n)
//원소가 많지만, 수의 범위가 좁을 경우
//수의 범위가 작다면 카운팅 정렬을 사용하여 더욱 빠르게 정렬할 수 있습니다.

public class SortNumber2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        List<Integer> dataList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            dataList.add(Integer.parseInt(br.readLine()));

        }

        Collections.sort(dataList);

        StringBuffer sb = new StringBuffer();
        for(int value : dataList) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
