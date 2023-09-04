package codingtest.baekjoon.onedimensionalarray;

//https://www.acmicpc.net/problem/10871

import java.io.*;
import java.util.StringTokenizer;

public class MoreSmallNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int val = Integer.parseInt(st.nextToken());
            if(val<num){
                bw.write(val+" ");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
