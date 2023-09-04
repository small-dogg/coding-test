package codingtest.book.문자열;

public class 시저암호 {
    public static void main(String[] args) {
        new 시저암호().solution("z",1);
    }
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c>='a'&&c<='z'){
                c+=n;
                if(c>'z'){
                    c-=26;
                }
            } else if (c >= 'A' && c <= 'Z') {
                c += n;
                if(c>'Z') {
                    c-=26;
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
