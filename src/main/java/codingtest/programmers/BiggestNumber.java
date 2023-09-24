package codingtest.programmers;

import java.util.Arrays;

public class BiggestNumber {
    public String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i]=String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        StringBuilder sb = new StringBuilder();

        if(str[0].equals("0"))return "0";

        for (String s : str) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        new BiggestNumber().solution(new int[]{3, 30, 34, 5, 9});
    }
}
