package codingtest.basicmath2;

//https://www.acmicpc.net/problem/2581

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;
        for (int i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (min == 0) {
                    min = i;
                }
                sum += i;
            }
        }
        if(min==0){
            System.out.println(-1);
        }else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
