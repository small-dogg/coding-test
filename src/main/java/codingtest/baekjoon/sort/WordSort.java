package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/1181

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            strSet.add(br.readLine());
        }

        List<String> strList = new ArrayList<>(strSet);

        strList.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }

            return o1.compareTo(o2);
        });

//위처럼 소팅할 수 있음...
//        strList.sort((o1, o2) -> {
//            int result;
//            if (o1.length() > o2.length()) {
//                result = 1;
//            } else if (o1.length() == o2.length()) {
//                List<String> list = new ArrayList<>(List.of(o1, o2));
//                Collections.sort(list);
//                result = list.get(0) == o1 ? -1 : 1;
//            } else {
//                result = -1;
//            }
//            return result;
//        });

        for (String s : strList) {
            System.out.println(s);
        }
    }
}
