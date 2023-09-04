package codingtest.book.정렬;

import java.util.Arrays;

public class HIndex {
    //    논문 n편 중 h번 이상 인용된 논문이 h 편 이상이고 나머지 논문이  h 번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index이다.
    public int solution(int[] citations) {
        Arrays.sort(citations);

        //h의 범위에 따라 역으로 순회하며  h.의 조건을 검사
        for (int h = citations.length; h >= 1; h--) {
            if (isValid(citations, h)) return h;
        }
        return 0;
    }

    //h의 조건 검사
    private boolean isValid(int[] citations, int h) {
        int index = citations.length - h;
        return citations[index] >= h;
    }

//    public int solution(int[] citations) {
//        int max=0;
//
//        Arrays.sort(citations);
//        for (int i = 0; i < citations.length; i++) {
//            int h = citations.length-i;
//
//            if (citations[i] >= h) {
//                max = h;
//                break;
//            }
//        }
//
//        return max;
//    }
}
