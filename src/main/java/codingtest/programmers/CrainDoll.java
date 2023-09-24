package codingtest.programmers;

import java.util.Stack;

public class CrainDoll {
    public int solution(int[][] board, int[] moves) {
        int pang = 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int move : moves) {
            move--;
            for (int i = 0; i < board.length; i++) {
                if (board[i][move] > 0) {
                    if(stack.peek()==board[i][move]){
                        stack.pop();
                        pang+=2;
                    }else {
                        stack.push(board[i][move]);
                    }
                    board[i][move] = 0;
                    break;
                }
            }
        }

        return pang;
    }

    public static void main(String[] args) {
        new CrainDoll().solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[]{1, 5, 3, 5, 1, 2, 1, 4});
    }
}