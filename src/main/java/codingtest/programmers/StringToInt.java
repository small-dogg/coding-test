package codingtest.programmers;

import java.util.Objects;

public class StringToInt {
    public int solution(String s) {
        String[] arr = s.split("");

        int plusMinus = 0;
        if(Objects.equals(arr[0], "-")){
            return Integer.parseInt(s.substring(1)) * -1;
        }else if(Objects.equals(arr[0], "+")){
            return Integer.parseInt(s.substring(1));
        }else{
            return Integer.parseInt(s);
        }
    }
}
