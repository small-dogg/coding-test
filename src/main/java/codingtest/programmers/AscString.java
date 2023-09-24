package codingtest.programmers;

import java.util.Arrays;
import java.util.Collections;

public class AscString {
    public String solution(String s) {
        String[] sArr = s.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        return String.join("", sArr);
    }

    public static void main(String[] args) {
        new AscString().solution("afeoif");
    }
}
