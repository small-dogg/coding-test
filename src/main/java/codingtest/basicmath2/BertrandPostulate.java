package codingtest.basicmath2;

//https://www.acmicpc.net/problem/4948

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BertrandPostulate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[123456*2+1];
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= 123456*2; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= 123456*2; j += i) {
                    prime[j] = true;
                }
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            int cnt = 0;
            for (int i = n+1; i <= n*2; i++) {
                if (!prime[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
}
