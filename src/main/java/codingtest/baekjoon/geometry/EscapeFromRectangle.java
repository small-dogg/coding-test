package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/1085

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeFromRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int val = 0;

        if(x<w-x){
            val = x;
        }else{
            val = w-x;
        }

        if(y<h-y){
            if(val>y){
                val = y;
            }
        }else{
            if(val>h-y){
                val = h-y;
            }
        }

        System.out.println(Math.min(Math.min(x, y), Math.min(w - x, h - y)));

        System.out.println(val);
    }
}
