package codingtest.book.스택과큐;

import java.util.Stack;

public class 올바른괄호 {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty()) return false;
                    stack.pop();
            }
        }
        return stack.isEmpty()?true:false;
    }
}

// CorrectBracket.class
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        int index = 0;
//        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//
//        for(int i=0;i<s.length();i++){
//            if(index==0&&s.charAt(i)==(')')){
//                return false;
//            }
//
//            if(s.charAt(i)==('(')){
//                index++;
//            }else{
//                index--;
//            }
//
//
//        }
//
//        if(index>0){
//            return false;
//        }
//
//        return true;
//    }
//}