package codingtest.baekjoon.conditionalstatement;

//https://www.acmicpc.net/problem/2525

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class OvenClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] timeArr = br.readLine().split(" ");
        int duration = Integer.parseInt(br.readLine());

        LocalTime localTime = LocalTime.of(Integer.parseInt(timeArr[0]), Integer.parseInt(timeArr[1])).plus(duration, ChronoUnit.MINUTES);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
    }
}
