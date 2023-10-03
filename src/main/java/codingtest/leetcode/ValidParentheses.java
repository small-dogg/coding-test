package codingtest.leetcode;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    brackets.push(c);
                    break;
                default:
                    if(brackets.empty()){
                        return false;
                    }
                    Character pop = brackets.pop();
                    if (pop == '{' && c != '}') {
                        return false;
                    } else if (pop == '[' && c != ']') {
                        return false;
                    } else if (pop == '(' && c != ')') {
                        return false;
                    }
            }
        }
        return brackets.empty();
    }
}
