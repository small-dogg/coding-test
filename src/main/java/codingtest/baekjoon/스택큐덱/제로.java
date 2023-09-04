package codingtest.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//9012
public class 제로 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            int val = Integer.parseInt(br.readLine());
            if (val == 0) {
                stack.pop();
            }else{
                stack.push(val);
            }
        }

        int sum = 0;
        for (Integer integer : stack) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
