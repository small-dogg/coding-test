package codingtest.programmers.book.스택과큐;

import java.util.Stack;

public class 괄호회전하기 {
    private boolean isCorrect(char[] str, int offset) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length; i++) {
            char c = str[(offset + i) % str.length];
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case ')':
                case '}':
                case ']':
                    if(stack.isEmpty()) return false;
                    if(stack.pop()!= c) return false;

            }
        }
        return stack.isEmpty();
    }

    public int solution(String s) {
        char[] str = s.toCharArray();

        int count = 0;
        for (int offset = 0; offset < str.length; offset++) {
            if (isCorrect(str, offset)) {
                count++;
            }
        }
        return count;
    }
}


//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (isCorrect(s)) {
//                answer++;
//            }
//            s = String.format("%s%s", s.substring(1), s.charAt(0));
//        }
//        return answer;
//    }
//
//    private boolean isCorrect(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            switch (c) {
//                case '[':
//                case '{':
//                case '(':
//                    stack.push(c);
//                    break;
//                case ']':
//                    if (!isCorrect(stack, '[')) return false;
//                    break;
//                case '}':
//                    if (!isCorrect(stack, '{')) return false;
//                    break;
//                case ')':
//                    if (!isCorrect(stack, '(')) return false;
//                    break;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    private boolean isCorrect(Stack<Character> stack, char c2) {
//        if (!stack.isEmpty() && stack.peek() == c2) {
//            stack.pop();
//            return true;
//        }
//        return false;
//    }
//}