package codingtest.basicmath2;

//https://www.acmicpc.net/problem/1978

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSosu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        while(st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if(isPrime(val)){
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean isPrime(int n) {
        if(n==1){
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
