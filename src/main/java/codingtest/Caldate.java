package codingtest;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Caldate {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016,a,b);
        return date.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US);
    }

    public String solution2(int a, int b) {
        String answer = "";

        int[] c = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] mm ={"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int aDate = 0;
        for(int i = 0 ; i< a-1; i++){
            aDate += c[i];
        }
        aDate += b-1;
        answer = mm[aDate %7];

        return answer;
    }

    public String getDayName(int a, int b) {
        String answer = "";
        String[] day = { "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU" };
        int[] date = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int allDate = 0;
        for (int i = 0; i < a - 1; i++) {
            allDate += date[i];
        }
        allDate += (b - 1);
        answer = day[allDate % 7];

        return answer;
    }



    public static void main(String[] args) {
        new Caldate().solution(4,15);
    }
}
