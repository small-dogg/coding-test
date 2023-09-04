package codingtest.baekjoon.geometry;

//https://www.acmicpc.net/problem/3009

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class FourthPoint {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        xMap.put(Integer.parseInt(st.nextToken()), 1);
        yMap.put(Integer.parseInt(st.nextToken()), 1);

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        xMap.put(x, xMap.getOrDefault(x, 0)+1);
        yMap.put(y, yMap.getOrDefault(y, 0)+1);

        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        xMap.put(x, xMap.getOrDefault(x, 0)+1);
        yMap.put(y, yMap.getOrDefault(y, 0)+1);

        StringBuilder sb = new StringBuilder();

        Set<Integer> integerX = xMap.keySet();
        for (Integer integer : integerX) {
            if(xMap.get(integer)==1){
                sb.append(integer).append(' ');
                break;
            }
        }

        Set<Integer> integerY = yMap.keySet();
        for (Integer integer : integerY) {
            if(yMap.get(integer)==1){
                sb.append(integer);
                break;
            }
        }

        System.out.println(sb);
    }
}
