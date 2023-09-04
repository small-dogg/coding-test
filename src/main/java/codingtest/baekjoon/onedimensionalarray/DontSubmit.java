package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/5597

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DontSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[30];
        for (int i = 0; i < 28; i++) {
            int val = Integer.parseInt(br.readLine())-1;
            ints[val]++;
        }

        for (int i = 0; i <= ints.length; i++) {
            if(ints[i]==0){
                System.out.println(i+1);
            }
        }
    }
}
