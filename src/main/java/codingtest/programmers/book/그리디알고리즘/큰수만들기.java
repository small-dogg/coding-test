package codingtest.programmers.book.그리디알고리즘;

import java.util.Stack;
import java.util.stream.Collectors;

public class 큰수만들기 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char c : number.toCharArray()) {
            //아직 자리수가 초과되지않았고,
            //stack이 비어있지 않으며,
            //체크하는 수가 넣어둔 수보다 크면
            while (k > 0 && !stack.isEmpty() && c > stack.peek()) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        //k가 남아있다면 스택에 들어간 것들중에 k가 0이될때까지 지워야하는데 마지막쪽이 작은 숫자이기때문에 마지막 부터 지움.
        while (k-- > 0) {
            stack.pop();
        }

        return stack.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
