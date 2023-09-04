package codingtest.book.정렬;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).sorted().toArray();
    }

//    public int[] solution(int[] numbers) {
//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                int i1 = numbers[i] + numbers[j];
//                integers.add(i1);
//            }
//        }
//        Collections.sort(integers);
//        return integers.stream().mapToInt(i -> i).distinct().toArray();
//    }
}
