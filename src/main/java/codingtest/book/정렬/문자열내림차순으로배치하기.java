package codingtest.book.정렬;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        return s.chars()
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }


//        public String solution(String s) {
//            String[] sArr = s.split("");
//            Arrays.sort(sArr, Collections.reverseOrder());
//            return String.join("", sArr);

    public String solution2(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
