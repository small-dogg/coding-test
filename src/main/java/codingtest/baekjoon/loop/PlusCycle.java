package codingtest.baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) throws IOException {

        int val = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int newVal = val;
        int cnt = 0;
        do{
            if(newVal<10){
                newVal = (newVal*10)+(newVal % 10);
                cnt++;
            }else {
                newVal = (newVal % 10 * 10) + (newVal / 10 + newVal % 10)%10;
                cnt++;
            }
        }while (val!=newVal);
        System.out.println(cnt);
    }
}
