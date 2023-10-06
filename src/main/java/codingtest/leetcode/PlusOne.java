package codingtest.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class PlusOne {
    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{9,8,7,6,5,4,9,9,9,9});
    }
    public int[] plusOne(int[] digits) {
        Stack<Integer> stack = new Stack<>();
        digits[digits.length-1] = digits[digits.length-1]+1;
        for (int i = digits.length-1; i >=0; i--) {
            if(digits[i]>=10){
                stack.push(digits[i]-10);
                if(i==0){
                    stack.push(1);
                }else{
                    digits[i-1]+=1;
                }
            }else{
                stack.push(digits[i]);
            }
        }
        int[] ints = new int[stack.size()];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = stack.pop();
        }
        return ints;
    }

//    마지막이 9인경우에 0으로 치환하고, 그렇지 않은경우는 1자리 더해서 반환... 미쳤다
    public int[] plusOne2(int[] digits){
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
