package codingtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringIndexSort {
    public String[] solution(String[] strings, int n) {
        String[] result = new String[strings.length];
        List<String> stringList = new ArrayList<>();
        for(String s : strings){
            stringList.add(s.charAt(n)+s);
        }

        Collections.sort(stringList);

        for (int i = 0; i < stringList.size(); i++) {
            result[i]=stringList.get(i).substring(1);
        }
        return strings;
    }

    public String[] solution2(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) > s2.charAt(n)) return 1;
            else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
            else if(s1.charAt(n) < s2.charAt(n)) return -1;
            else return 0;
        });
        return strings;
    }

    public static void main(String[] args) {
        new StringIndexSort().solution(new String[]{"abcd","abce","xxx"},2);
    }
}
