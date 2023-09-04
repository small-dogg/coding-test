package codingtest;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class RemovePair {
    public int solution(String s)
    {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
                continue;
            }
            stack.add(c);
        }
        return stack.isEmpty()?1:0;
    }

    public static void main(String[] args) {
        new RemovePair().solution("baabaa");
    }
}
