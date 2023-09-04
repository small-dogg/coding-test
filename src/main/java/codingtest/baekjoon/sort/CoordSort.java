package codingtest.baekjoon.sort;

//https://www.acmicpc.net/problem/11650

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CoordSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();


        List<Coordinate> coordList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            coordList.add(new Coordinate(x,y));
        }

        coordList.sort(Coordinate::compareTo);

        for (Coordinate coordinate : coordList) {
            sb.append(coordinate).append("\n");
        }

        System.out.println(sb);
    }

    private static class Coordinate implements Comparable<Coordinate> {
        private int x;
        private int y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Coordinate o) {
            if (this.x == o.x) return this.y - o.y;
            return this.x - o.x;
        }

        @Override
        public String toString() {
            return x + " " + y;
        }
    }
}
