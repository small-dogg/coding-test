package codingtest.programmers;

import java.util.Stack;

public class Bracket {
    public int solution(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isCorrect(s)) { // (1)
                answer++;
            }
            s = String.format("%s%s", s.substring(1), s.charAt(0)); // (2)
        }
        return answer;
    }

    private boolean isCorrect(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '[':
                case '{':
                case '(':
                    stack.push(c);
                    break;
                case ']':
                    if (!isCorrect(stack, '[')) return false;
                    break;
                case '}':
                    if (!isCorrect(stack, '{')) return false;
                    break;
                case ')':
                    if (!isCorrect(stack, '(')) return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    private boolean isCorrect(Stack<Character> stack, char c2) {
        if (!stack.isEmpty() && stack.peek() == c2) {
            stack.pop();
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Bracket().solution("[](){}"));
        System.out.println(new Bracket().solution("}]()[{"));
    }
}
