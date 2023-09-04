package codingtest.book.문자열;

public class 문자열을다른방식으로생각해보기 {
    public static void main(String[] args) {
        문자열을다른방식으로생각해보기 obj = new 문자열을다른방식으로생각해보기();

        obj.solution(12345L);

    }

    private int[] solution(Long n) {
        String s = Long.toString(n);
        StringBuilder sb = new StringBuilder(s);
        char[] chars = sb.reverse().toString().toCharArray();

        int[] arr = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            arr[i] = Character.getNumericValue(chars[i]);
        }

        return arr;
    }
}
