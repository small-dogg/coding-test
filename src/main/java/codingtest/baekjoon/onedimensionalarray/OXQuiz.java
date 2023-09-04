package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/8958

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OXQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            String s = br.readLine();
            char[] chars = s.toCharArray();
            int cnt = 1;
            int sum = 0;
            for (char c : chars) {
                if(c=='X'){
                    cnt=1;
                }else{
                    sum+=cnt;
                    cnt++;
                }
            }
            System.out.println(sum);
        }
    }
}
