package codingtest.basicmath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WomenPresident {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());

        int[][] ints = new int[15][15];
        for(int i = 0; i < 15; i++) {
            ints[i][1] = 1;
            ints[0][i] = i;
        }

        for (int i = 1; i < ints.length; i++) {
            for (int j = 2; j < ints[i].length; j++) {
                if(i==0){
                    ints[i][j] = j+1;
                } else{
                    ints[i][j] = ints[i][j-1]+ints[i-1][j];
                }
            }
        }

        for (int i = 0; i < length; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            System.out.println(ints[k][n]);
        }
    }
}
