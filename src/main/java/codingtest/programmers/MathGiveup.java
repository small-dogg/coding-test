package codingtest.programmers;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MathGiveup {
    private final int[] giveup1= {1, 2, 3, 4, 5};
    private final int[] giveup2= {2, 1, 2, 3, 2, 4, 2, 5};
    private final int[] giveup3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        int giveup1Corr= 0;
        int giveup2Corr= 0;
        int giveup3Corr= 0;
        for (int i = 0; i < answers.length; i++) {
            if(giveup1[i%giveup1.length]==answers[i]){
                giveup1Corr++;
            }
            if(giveup2[i%giveup2.length]==answers[i]){
                giveup2Corr++;
            }
            if(giveup3[i%giveup3.length]==answers[i]){
                giveup3Corr++;
            }
        }
        List<Integer> integers = Arrays.asList(giveup1Corr, giveup2Corr, giveup3Corr);
        Collections.sort(integers, Collections.reverseOrder());
        Integer max = integers.get(0);
        List<Integer> resultList = new LinkedList<>();
        if(giveup1Corr==max) resultList.add(1);
        if(giveup2Corr==max) resultList.add(2);
        if(giveup3Corr==max) resultList.add(3);
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        new MathGiveup().solution(new int[]{1, 3, 2, 4, 2,2,3,5,4,3,2,1,3});
    }
}
