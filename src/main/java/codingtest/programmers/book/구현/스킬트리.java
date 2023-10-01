package codingtest.programmers.book.구현;

import java.util.Arrays;

public class 스킬트리 {
    public int solution(String skill, String[] skillTrees) {
        return (int) Arrays.stream(skillTrees)
                .map(s -> s.replaceAll("[^" + skill + "]",""))//skill 에 등장하지 않은 모든 문자 제거
                .filter(skill::startsWith)//skill과 동일한 순서로 입력된 대상만 필터
                .count();//필터 대상 카운트
    }
}
