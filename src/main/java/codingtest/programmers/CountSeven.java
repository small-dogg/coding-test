package codingtest.programmers;

public class CountSeven {
    public int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            while (i > 0) {
                if (i % 10 == 7) answer++;
                i /= 10;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new CountSeven().solution(new int[]{7, 77, 1}));
    }
}
