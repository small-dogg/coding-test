package codingtest.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Counting Sort

public class SortNumber3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[] arr = new int[length];
        int[] counting = new int[100001];
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = (Integer.parseInt(br.readLine()));
        }

        for (int i : arr) {
            counting[i]++;
        }

        for (int i = 1; i < counting.length; i++) {
            counting[i]+=counting[i-1];
        }

        for (int i = arr.length-1; i >= 0; i--) {
            result[counting[arr[i]]-1]=arr[i];
            counting[arr[i]]--;
        }

        StringBuffer sb = new StringBuffer();
        for(int value : result) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
