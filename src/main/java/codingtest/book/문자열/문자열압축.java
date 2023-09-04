package codingtest.book.문자열;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 문자열압축 {

    public static void main(String[] args) {
        System.out.println(new 문자열압축().solution("aabbaccc"));
    }

    public List<String> tokenize(String s, int length) {

        ArrayList<String> tokens = new ArrayList<>();

        for (int i = 0; i < s.length(); i += length) {
            int end = i + length;
            if (s.length() < end) {
                end = s.length();
            }
            tokens.add(s.substring(i, end));
        }

        return tokens;
    }

    public int compress(String s, int length) {

        StringBuilder sb = new StringBuilder();

        List<String> tokens = tokenize(s, length);
        String before = tokens.get(0);
        int size = 1;

        for (int i = 1; i < tokens.size(); i++) {
            String now = tokens.get(i);
            if (!now.equals(before)) {
                if(size>1) {
                    sb.append(size).append(before);
                }else{
                    sb.append(before);
                }
                size = 1;
            } else {
                size++;
            }
            before = now;
        }

        if(size>1){
            sb.append(size);
        }
        sb.append(before);

        return sb.toString().length();
    }

    public int solution(String s) {
        int min = s.length();

        for (int length = 1; length < s.length(); length++) {
            int compress = compress(s, length);
            if (compress < min) {
                min = compress;
            }
        }

        return min;
    }
}
