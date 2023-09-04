package codingtest.basicmath1;

//https://www.acmicpc.net/problem/2292

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.acmicpc.net/problem/2292

public class Hive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int a = 1;
        int num = 2;
        if (target == 1) {
            System.out.println(1);
        } else {
            while (num <= target) {
                num = num + (6 * a);
                a++;
            }
            System.out.print(a);
        }
    }
}
