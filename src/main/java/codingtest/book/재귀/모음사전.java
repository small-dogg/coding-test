package codingtest.book.재귀;

import java.util.ArrayList;
import java.util.List;

// 길이 5 이하의 A, E, I, O, U만 가지고 만들 수 있는 단어 사전
// 사전 구성 : A(첫번째단어), AA, .... UUUUU(마지막단어)
//단어 하나 'word'가 매개로 주어질 때, 이 단어가 사전의 몇번째 인지를 return
public class 모음사전 {

    private static final char[] CHARS = "AEIOU".toCharArray();

    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generate("", words);
        return words.indexOf(word);
    }

    public void generate(String word, List<String> words){
        words.add(word);

        //종료조건 : 길이가 5를 넘어가면 시마이.
        if(word.length() == 5) return;

        // 점화식 구현

        for (char c : CHARS) {
            generate(word + c, words);
        }
    }
}
