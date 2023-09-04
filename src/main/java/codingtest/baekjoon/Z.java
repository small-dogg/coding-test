package codingtest.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//틀린문제. 배열의 방향으로 푸는게 아님
public class Z {

    private static final int[] dx = {1, -1, 1};
    private static final int[] dy = {0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int sy = Integer.parseInt(st.nextToken());
        int sx = Integer.parseInt(st.nextToken());

        int pow = (int) Math.pow(2, N);
        boolean[][] arr = new boolean[pow][pow];

        int x = 0;
        int y = 0;
        int d = 0;
        boolean sw = true;
        int index = 0;

        while (true) {
            if (x == sx && y == sy) break;
            arr[y][x] = true;
            if(d==3){
                d = 0;
                if (sw) {
                    x += 1;
                    y -= 1;
                    sw = false;
                } else {
                    x -= 3;
                    y += 1;

                    sw = true;
                }
            }else {
                x = x + dx[d];
                y = y + dy[d];
                d++;
            }
            index++;

        }

        System.out.println(index);
    }
}
