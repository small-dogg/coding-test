package codingtest.programmers;

import java.util.Arrays;

public class IntegerDescending {
    public long solution(long n) {
        long answer = 0;
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String str : list) sb.append(str);
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        new IntegerDescending().solution(193473);
    }
}
