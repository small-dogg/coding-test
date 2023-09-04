package codingtest.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10250
public class ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        for (int i = 0; i < length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            if (n % h == 0) {
                System.out.println(h * 100 + (n / h));
            } else {
                System.out.println((n % h) * 100 + (n / h) + 1);
            }
        }
    }
}
