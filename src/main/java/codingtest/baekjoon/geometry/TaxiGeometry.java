package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/3053

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxiGeometry {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(br.readLine());

        System.out.println(Math.pow(radius, 2) * Math.PI);
        System.out.println(2*Math.pow(radius,2));
    }
}
