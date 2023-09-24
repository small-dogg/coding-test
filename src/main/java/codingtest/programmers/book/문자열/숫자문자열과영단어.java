package codingtest.programmers.book.문자열;

public class 숫자문자열과영단어 {
    private static final String[] NUMBER = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    public int solution(String s) {
        for (int i = 0; i < NUMBER.length; i++) {
            s = s.replaceAll(NUMBER[i], String.valueOf(i));
        }

        return Integer.parseInt(s);
    }
}
