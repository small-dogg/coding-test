package codingtest.programmers.book.정렬;

import java.util.Arrays;
import java.util.Comparator;

public class 직접기준정하기 {
    //배열 : Arrays.sort(Comparator<T> c) 전달받은 배열 자체를 정렬
    //List, Vector, ... : Collections.sort(Comparator<T> c) 전달받은 Collectino 자체를 정렬
    //Stream : stream.sorted(Comparator<T> c) 정렬된 Stream을 반환

    /**
     * Comparator<T>의 반환값
     * 0 : 두 객체가 같다
     * 양수 : 왼쪽 객체가 더 크다
     * 음수 : 오른쪽 객체가 더 크다
     */

    public static void main(String[] args) {

        //숫자 내림차순 정렬
        int[] arr = {5, 3, 7, 4, 7, 4, 0, 9};
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = Arrays.stream(arr)
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .mapToInt(Integer::intValue)
                .toArray();

        System.out.println(Arrays.toString(sortedArr));


        //문자열 길이순 정렬
        String[] words = {"java", "algorithm", "programming", "happy", "fun", "coding"};
        System.out.println(Arrays.toString(words));

        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
    }
}
