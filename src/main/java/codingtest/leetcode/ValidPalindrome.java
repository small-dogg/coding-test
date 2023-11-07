package codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ValidPalindrome {
    public static void main(String[] args) {
        new ValidPalindrome().isPalindrome("0P");
    }
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();
        List<Character> characters = new ArrayList<>();
        for (char c : charArray) {
            if(c>='a'&&c<='z'){
                characters.add(c);
            }
            if(c>='0'&&c<='9'){
                characters.add(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : characters) {
            sb.append(character);
        }

        return sb.toString().contentEquals(sb.reverse());
    }

    public boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
