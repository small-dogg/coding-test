package codingtest.programmers.book.문자열;

public class 문자열다루기기본 {
    public boolean solution(String s){
        String regex = "[0-9]{4}|[0-9]{6}";

        return s.matches(regex);
    }
}
