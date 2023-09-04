package codingtest.baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/10809

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();

        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        for (int i = 0; i < chars.length; i++) {
            if (arr[chars[i] - 'a'] == -1) {
                arr[chars[i] - 'a'] = i;
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
