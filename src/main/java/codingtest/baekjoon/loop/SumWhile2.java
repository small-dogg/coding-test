package codingtest.baekjoon.loop;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10951

public class SumWhile2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
    }
}
