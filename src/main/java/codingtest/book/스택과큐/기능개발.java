package codingtest.book.스택과큐;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        int days = 0;
        int count = 0;
        List<Integer> result = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            int index = q.poll();
            int expiration = (int) Math.ceil((double) (100 - progresses[index] / speeds[index]));



            if (expiration > days) {
                if (days != 0) {
                    result.add(count);
                    count = 0;
                }
                days = expiration;
            }
            count++;
        }

        result.add(count);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

//기존 코드
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] lefts = new int[progresses.length];
//        for (int i = 0; i < progresses.length; i++) {
//            int left = (100 - progresses[i]) / speeds[i];
//            if((100 - progresses[i]) % speeds[i]>0) left += 1;
//            lefts[i] = left;
//        }
//
//        List<Integer> integers = new ArrayList<>();
//        for (int i = 0; i <lefts.length; i++) {
//            int tmp  = 1;
//            if(lefts[i]==-1) continue;
//
//            for (int j = i+1; j < lefts.length; j++) {
//                if(lefts[j]<=lefts[i]){
//                    tmp++;
//                    lefts[j]=-1;
//                }else{
//                    break;
//                }
//            }
//            integers.add(tmp);
//        }
//        return integers.stream().mapToInt(i -> i).toArray();
//    }
//}