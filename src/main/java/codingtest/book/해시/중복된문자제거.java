package codingtest.book.해시;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class 중복된문자제거 {
    public String solution(String myString) {
        Set<String> result = new LinkedHashSet<>(Arrays.asList(myString.split("")));
        return String.join("", result);
    }
}
