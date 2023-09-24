package codingtest.programmers;

public class SliceNSqrtArr {

    public int[] solution(int n, long left, long right) {
        int len = (int) right - (int) left;
        int[] answer = new int[len + 1];

        int idx = 0;
        for (long i = left; i <= right; i++) {
            long row = i / n;
            long col = i % n;
            answer[idx++] = Math.max((int)row, (int)col) + 1;
        }

        return answer;
    }


    public static void main(String[] args) {
        new SliceNSqrtArr().solution(3, 2, 5);
    }
}