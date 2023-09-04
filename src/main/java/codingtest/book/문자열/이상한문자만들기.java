package codingtest.book.문자열;

public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        boolean toUpper = true;
        for (char c : chars) {
            if(Character.isSpaceChar(c)){
                sb.append(c);
                toUpper = true;
            }else{
                if(toUpper) {
                    sb.append(Character.toUpperCase(c));
                }else{
                    sb.append(Character.toLowerCase(c));
                }
                toUpper = !toUpper;
            }
        }
        return sb.toString();
    }
}
