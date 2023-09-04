package codingtest;

import java.util.ArrayList;
import java.util.List;

public class RemoveMinNum {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        List<Integer> intList = new ArrayList<>();
        int min=arr[0];
        for(int a : arr){
            if(a<min){
                min = a;
            }
        }
        System.out.println(min);
        for(int a : arr){
            if(a != min){
                intList.add(a);
            }
        }
        int[] answer = {};
        return intList.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
