package codingtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberTwoSum {
    public int[] solution(int[] numbers) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int i1 = numbers[i] + numbers[j];
                integers.add(i1);
            }   
        }
        Collections.sort(integers);
        return integers.stream().mapToInt(i -> i).distinct().toArray();
    }
}
