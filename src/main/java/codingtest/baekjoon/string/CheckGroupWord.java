package codingtest.baekjoon.string;

//https://www.acmicpc.net/problem/1316

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CheckGroupWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int num = 0;
        for (int i = 0; i < length; i++) {
            char[] arr = br.readLine().toCharArray();

            List<Character> list = new ArrayList<>();
            char now = arr[0];
            list.add(arr[0]);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != now) {
                    if (list.contains(arr[j])) {
                        break;
                    }
                    now = arr[j];
                    list.add(arr[j]);
                }
                if(j==arr.length-1){
                    num++;
                }
            }
        }

        System.out.println(num);

    }
}
