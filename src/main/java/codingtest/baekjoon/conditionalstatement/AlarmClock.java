package codingtest.baekjoon.conditionalstatement;

//https://www.acmicpc.net/problem/2884

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class AlarmClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String timeStr = br.readLine();
        String[] timeArr = timeStr.split(" ");

        LocalTime time = LocalTime.of(Integer.parseInt(timeArr[0]), Integer.parseInt(timeArr[1])).minus(45L, ChronoUnit.MINUTES);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
    }
}
