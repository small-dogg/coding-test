package codingtest.baekjoon.basicmath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/11653
public class Factorization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while(n!=1){
            for (int i = 2; i <= n; i++) {
                if(n%i==0){
                    n/=i;
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}
