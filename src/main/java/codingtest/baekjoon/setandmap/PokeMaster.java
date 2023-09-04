package codingtest.baekjoon.setandmap;

//https://www.acmicpc.net/problem/1620

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokeMaster {
    static String NUMBER_REGEX = "^[0-9]*$";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            map1.put(s,i);
            map2.put(i,s);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            if(s.matches(NUMBER_REGEX)){
                sb.append(map2.get(Integer.parseInt(s)-1)).append("\n");
            }else{
                sb.append(map1.get(s)+1).append("\n");
            }
        }

        System.out.println(sb);
    }
}
