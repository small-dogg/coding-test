package codingtest.baekjoon.arithmetic;

import java.util.Scanner;

//https://www.acmicpc.net/problem/3003
public class ChessCount {

    // 1 1 2 2 2 8
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] cnt = new int[6];
        int[] full = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            cnt[i] = scanner.nextInt();
        }

        for (int i = 0; i < full.length; i++) {
            cnt[i] = full[i] - cnt[i];
            System.out.println(cnt[i]);
        }
    }
}
