package codingtest.book.해시;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A로B만들기 {
    public static void main(String[] args) {
        new A로B만들기().solution("olleh", "hello");
    }

    public int solution(String before, String after) {
        return toMap(before).equals(toMap(after)) ? 1 : 0;
    }

    private static Map<Character, Long> toMap(String word) {
        Map<Character, Long> map = new HashMap<>();
        for (char c : word.toCharArray()) {
            map.putIfAbsent(c, 0L);
            map.put(c, map.get(c) + 1);
        }
        return map;
    }

    public int solution2(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }
}
