package codingtest.tip;

//https://www.acmicpc.net/problem/25501

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecusivevisuceR {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            recusive(br.readLine().toCharArray(),0);

        }
    }

    private static void recusive(char[] chars, int idx) {
        if(chars.length/2==idx){
            System.out.println("1 "+(idx+1));
        }else{
            if(chars[idx]==chars[chars.length-1-idx]){
                recusive(chars,++idx);
            }else{
                System.out.println("0 "+(idx+1));
            }
        }
    }
}
