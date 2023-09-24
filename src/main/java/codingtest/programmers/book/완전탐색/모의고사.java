package codingtest.programmers.book.완전탐색;

import java.util.stream.IntStream;

public class 모의고사 {
    private static final int[][] RULES = new int[][]{{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    private int getPicked(int person, int problem) {
        int[] rule = RULES[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for (int problem = 0; problem < answers.length; problem++) {
            int answer = answers[problem];

            //각 수포자별로 정답 개수 세기
            for (int person = 0; person < 3; person++) {
                int picked = getPicked(person, problem);
                if (answer == picked) {
                    if(++corrects[person] > max) {
                        max = corrects[person];
                    }
                }

            }
        }

        final int maxCorrects = max;
        return IntStream.range(0, 3)
                .filter(i -> corrects[i] == maxCorrects)
                .map(i -> i + 1)
                .toArray();
    }
}

//과거 풀이
//class Solution {
//    private final int[] giveup1= {1, 2, 3, 4, 5};
//    private final int[] giveup2= {2, 1, 2, 3, 2, 4, 2, 5};
//    private final int[] giveup3= {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//    public int[] solution(int[] answers) {
//        int giveup1Corr= 0;
//        int giveup2Corr= 0;
//        int giveup3Corr= 0;
//        for (int i = 0; i < answers.length; i++) {
//            if(giveup1[i%giveup1.length]==answers[i]){
//                giveup1Corr++;
//            }
//            if(giveup2[i%giveup2.length]==answers[i]){
//                giveup2Corr++;
//            }
//            if(giveup3[i%giveup3.length]==answers[i]){
//                giveup3Corr++;
//            }
//        }
//        List<Integer> integers = Arrays.asList(new Integer[]{giveup1Corr, giveup2Corr, giveup3Corr});
//        Collections.sort(integers, Collections.reverseOrder());
//        Integer max = integers.get(0);
//        List<Integer> resultList = new LinkedList<>();
//        if(giveup1Corr==max) resultList.add(1);
//        if(giveup2Corr==max) resultList.add(2);
//        if(giveup3Corr==max) resultList.add(3);
//        return resultList.stream().mapToInt(i -> i).toArray();
//    }
//}