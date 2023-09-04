package codingtest.baekjoon.conditionalstatement;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2753

public class LeapYear {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        if((year%4==0&&year%100!=0)||year%400==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
