package codingtest.programmers.book.정렬;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
       Arrays.sort(strings, (s1,s2) -> {
           if (s1.charAt(n) != s2.charAt(n)) {
               return s1.charAt(n) - s2.charAt(n);
           }
           return s1.compareTo(s2);
       });

        return strings;
    }

//    public String[] solution(String[] strings, int n) {
//        String[] result = new String[strings.length];
//        List<String> stringList = new ArrayList<>();
//        for(String s : strings){
//            stringList.add(s.charAt(n)+s);
//        }
//
//        Collections.sort(stringList);
//
//        for (int i = 0; i < stringList.size(); i++) {
//            result[i]=stringList.get(i).substring(1);
//        }
//        return result;
//    }
}
