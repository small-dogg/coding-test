package codingtest.basicmath2;

//https://www.acmicpc.net/problem/9020

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldbachConjecture {
    public static void main(String[] args) throws IOException {
        boolean[] prime = new boolean[10001];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= 10000; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= 10000; j += i) {
                    prime[j] = true;
                }
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            int small = Integer.parseInt(br.readLine()) / 2;
            int big = small;
            while (true) {
                if (prime[small] & prime[big]) {
                    System.out.println(small + " " + big);
                    break;
                }
                small--;
                big++;
            }
        }
    }
}
