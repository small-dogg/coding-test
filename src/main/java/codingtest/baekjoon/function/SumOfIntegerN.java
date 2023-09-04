package codingtest.baekjoon.function;

import java.util.Arrays;

//https://www.acmicpc.net/problem/15596
public class SumOfIntegerN {

    public long sum(int[] a){
        long sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
}
