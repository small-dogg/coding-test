package codingtest.스킬체크테스트.lv1;

import java.util.Arrays;

public class S509386 {
    public static void main(String[] args) {
        new S509386().solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
    }

    public int solution(int n, int[] lost, int[] reserve) {

        int total = n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌 체육복을 가져온 학생이 도난당한 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    total++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if ((lost[i] - 1 == reserve[j]) || (lost[i] + 1 == reserve[j])) {
                    total++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return total;
    }
}
