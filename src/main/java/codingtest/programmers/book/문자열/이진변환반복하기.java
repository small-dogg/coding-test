package codingtest.programmers.book.문자열;

public class 이진변환반복하기 {

    public static void main(String[] args) {
        int[] solution = new 이진변환반복하기().solution("110010101001");
        System.out.println();
    }

    public int[] solution(String s) {

        int removed = 0;
        int loop = 0;

        String now = s;

        while (now.length()!=1) {
            int zeros = 0;
            loop++;
            char[] chars = now.toCharArray();
            for (char c : chars) {
                if (c == '0') {
                    zeros++;
                }
            }
            removed += zeros;
            now = Integer.toString(chars.length-zeros,2);
        }

        return new int[]{loop, removed};

    }
}
