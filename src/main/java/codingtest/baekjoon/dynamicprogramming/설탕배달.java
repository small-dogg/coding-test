package codingtest.baekjoon.dynamicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int val = Integer.parseInt(br.readLine());

        int size = 0;
        while(val!=0){
            if(val%5==0) {
                size+=val/5;
                break;
            }
            size++;
            val -= 3;
        }
        System.out.println(size);
    }

}
