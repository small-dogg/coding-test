package codingtest.book.정렬;

import java.util.Arrays;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < answer.length; i++) {
            int[] command = commands[i];

            int[] sub = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            Arrays.sort(sub);
            answer[i] = sub[command[2] - 1];
        }

        return answer;
    }
}
