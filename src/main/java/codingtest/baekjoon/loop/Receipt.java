package codingtest.baekjoon.loop;

//https://www.acmicpc.net/problem/25304

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int amount = Integer.parseInt(br.readLine());
        int qty = Integer.parseInt(br.readLine());
        int calAmount = 0;
        for (int i = 0; i < qty; i++) {
            String[] s = br.readLine().split(" ");
            calAmount += Integer.parseInt(s[0]) * Integer.parseInt(s[1]);
        }
        System.out.println(amount==calAmount?"Yes":"No");
    }
}
