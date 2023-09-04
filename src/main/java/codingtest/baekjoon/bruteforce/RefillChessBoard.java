package codingtest.baekjoon.bruteforce;

//https://www.acmicpc.net/problem/1018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RefillChessBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sb = new StringTokenizer(br.readLine());
        int min = 64;
        int n = Integer.parseInt(sb.nextToken());
        int m = Integer.parseInt(sb.nextToken());

        boolean[][] board = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = str.charAt(j) == ('W');
            }
        }

        //전체 8x8 경우의 수에 대해
        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {

                int val = 0;
                boolean toggle = board[i][j];
                //각 경우의 수마다 순환하며 값 일치 여부 확인
                for (int l = i; l < i + 8; l++) {
                    for (int o = j; o < j + 8; o++) {
                        if (board[l][o] != toggle) {
                            val++;
                        }

                        toggle = (!toggle);
                    }
                    toggle = !toggle;
                }
                //첫 시작의 보드판의 색상이 반대일 경우, 두가지 케이스 중 가장 조금 칠해야하는 값을 체크하여 min 비교
                min = Math.min(min, Math.min(val, 64 - val));
            }
        }
        System.out.println(min);

    }
}
