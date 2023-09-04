package codingtest.book.정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 예제코드 {
    //배열 : Arrays.sort() 전달받은 배열 자체를 정렬
    //List, Vector, ... : Collections.sort() 전달받은 Collection 자체를 정렬
    //Stream : stream.sorted() 정렬된 Stream을 반환

    public static void main(String[] args) {
        int[] array = {5, 10, 7, 9, 3, 2};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        List<Integer> collection = new ArrayList<>(List.of(5, 10, 7, 9, 3, 2));
        Collections.sort(collection);
        System.out.println(collection);

        Stream<Integer> stream = Stream.of(5, 10, 7, 9, 3, 2).sorted();
        System.out.println(stream.collect(Collectors.toList()));
    }
}
