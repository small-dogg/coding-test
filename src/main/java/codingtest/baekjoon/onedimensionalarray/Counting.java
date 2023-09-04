package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/10807

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10807

public class Counting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int val = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            if(Integer.parseInt(st.nextToken())==val) cnt++;
        }

        System.out.println(cnt);
        br.close();
    }
}
