package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

public class DivideNum {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> intList = new ArrayList<>();
        for(int num:arr){
            if(divisor%num==0) intList.add(num);
        }
        return intList.size()>0?intList.stream().mapToInt(i->i).sorted().toArray():new int[]{-1};
    }
}
