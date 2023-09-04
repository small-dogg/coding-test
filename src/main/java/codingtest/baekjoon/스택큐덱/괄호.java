package codingtest.baekjoon.스택큐덱;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//9012
public class 괄호 {

    public static void main(String[] args) throws IOException {

        StringBuffer sb = new StringBuffer();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            char[] chars = br.readLine().toCharArray();
            int val = 0;
            for (int j = 0; j < chars.length; j++) {
                if(chars[j]=='('){
                    val++;
                }else{
                    val--;
                    if (val == -1) {
                        break;
                    }
                }
            }
            if (val != 0) {
                sb.append("NO").append("\n");
            }else{
                sb.append("YES").append("\n");
            }
        }
        System.out.println(sb);
    }
}
