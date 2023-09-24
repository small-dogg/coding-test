package codingtest.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/120826
public class 특정문자제거하기 {
    public String solution(String my_string, String letter) {

        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if(c!=letter.charAt(0)){
                sb.append(c);
            }
        }

        return sb.toString();

//        return my_string.replaceAll(letter, "");
    }
}
