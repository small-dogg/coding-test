package codingtest.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
//28278
public class 스택2 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("1")){
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.lastElement()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
