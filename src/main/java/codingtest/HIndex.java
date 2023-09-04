package codingtest;

import java.util.Arrays;

public class HIndex {
    public int solution(int[] citations) {
        int max=0;

        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length-1;

            if (citations[i] >= h) {
                max = h;
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int solution = new HIndex().solution(new int[]{3, 0, 6, 1, 5});
        System.out.println(solution);
    }
}
