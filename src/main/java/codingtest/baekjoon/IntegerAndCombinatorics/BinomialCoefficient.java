package codingtest.baekjoon.IntegerAndCombinatorics;

//https://www.acmicpc.net/problem/11050

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BinomialCoefficient {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(binomial(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));

    }

    static int binomial(int n, int r) {
        if(r == 0 || n == r)
            return 1;
        return binomial(n - 1, r - 1) + binomial(n - 1, r);
    }
}
