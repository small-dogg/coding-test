package codingtest.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        new LengthOfLastWord().lengthOfLastWord("  ");
    }
    public int lengthOfLastWord(String s) {
        s= s.trim();
        if(s.length()==0) return 0;
        if(s.indexOf(" ")==-1) return s.length();
        return s.substring(s.lastIndexOf(" "),s.length()).length();
    }

    //마지막부터 공백은 스킵하면서 문자를 만났을때부터 개수 세기
    public int lengthOfLastWord2(String s) {
        int count = 0;
        int j=0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(s.length()-1-j) == ' ') {
                j++;
                continue;
            }
            else {
                if(s.charAt(i) != ' ') {
                    count++;
                }
                else {
                    break;
                }
            }
        }
        return count;
    }
}
