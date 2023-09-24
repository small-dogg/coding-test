package codingtest.programmers;

import java.util.Arrays;
import java.util.List;

public class PressKeypad {
    private List<Integer> lt = Arrays.asList(1, 4, 7);
    private List<Integer> rt = Arrays.asList(3, 6, 9);

    public String solution(int[] numbers, String hand) {
        StringBuilder result = new StringBuilder();
        int l = 10;
        int r = 12;
        for (int number : numbers) {
            //1,3,4,6,7,9 처리
            if(lt.contains(number)){
                result.append("L");
                l = number;
            }else if(rt.contains(number)){
                result.append("R");
                r = number;
            }else{
                int ld = distance(l, number);
                int rd = distance(r, number);
                if(ld>rd){
                    result.append("R");
                    r = number;
                } else if (rd > ld) {
                    result.append("L");
                    l = number;
                }else{
                    if(hand.equals("right")){
                        result.append("R");
                        r = number;
                    }else{
                        result.append("L");
                        l = number;
                    }

                }
            }
        }
        System.out.println("result = " + result);
        return result.toString();
    }

    private int distance(int location, int number) {
        if(number==0) number=11;
        if(location==0) location=11;
        return (Math.abs(number-location))/3 + (Math.abs(number-location))%3;
    }

    public static void main(String[] args) {
        new PressKeypad().solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},"left");
    }
}
