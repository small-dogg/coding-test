package codingtest.book.문자열;

import java.util.ArrayList;
import java.util.List;

//60057 - 풀이중
public class 문자열압축2 {
    public static void main(String[] args) {
        int value = new 문자열압축2().solution("aabbaccc");
    }

    private List<String> split(String source, int length) {

        List<String> token = new ArrayList<String>();

        //source를 length만큼씩 잘라서 tokens 리스트에 추가
        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > source.length()) endIndex = source.length();
            token.add(source.substring(startIndex, endIndex));
        }

        return token;
    }

    private int compress(String source, int length) {
        //압축한 문자열의 길이 반환
        StringBuilder sb = new StringBuilder();

        for (String token : split(source, length)) {
            // 압축 문자열 구성
        }
        return 0;
    }

    private int solution(String s) {
        if (s.length() <= 2) {
            return s.length();
        }

        int min = Integer.MAX_VALUE;

        for (int length = 2; length < s.length(); length++) {
            //문자열 압축 후 가장 짧은 길이 선택

        }

        return 0;
    }
}
