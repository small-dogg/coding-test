package codingtest.book.이진탐색;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 이진탐색메서드 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 6, 7, 8, 10, 13, 17};
        List<Integer> list = List.of(1, 4, 6, 7, 8, 10, 13, 17);

        int arrayIndex = Arrays.binarySearch(array, 8);
        int listIndex = Collections.binarySearch(list, 8);

        System.out.println(arrayIndex);
        System.out.println(listIndex);
    }
}
