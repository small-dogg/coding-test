package codingtest.book.완전탐색;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 수식최대화 {
    public static void main(String[] args) {
        new 수식최대화().solution("100+200-400*60");
    }

    // 연산문자 우선순위에 따라 가장 큰값
    //3가지 연산문자 ( +, -, * )
    // 연산자 수에 따른 경우의 수 == (연산자 수)!
    // 결과가 음수일 경우 절댓값으로 변환하여 제출

    //    가능한 연산문자 조합 (재귀로 모든 경우의수를 정할 수 있지만, 6개밖에 안되니 직접 작성)
    private static final String[][] precedences = {
            "+-*".split(""),
            "+*-".split(""),
            "-+*".split(""),
            "-*+".split(""),
            "*+-".split(""),
            "+-+".split("")
    };

    //두 피연산자를 입력받아 연산결과를 반환
    private long calculate(long lhs, long rhs, String op) {
        switch (op) {
            case "+":
                return lhs + rhs;
            case "-":
                return lhs - rhs;
            case "*":
                return lhs * rhs;
            default:
                return 0;
        }
    }

    private long calculate(List<String> tokens, String[] precedence) {
        for (String op : precedence) {
            for (int i = 0; i < tokens.size(); i++) {
                if (tokens.get(i).equals(op)) {
                    long lhs = Long.parseLong(tokens.get(i - 1));
                    long rhs = Long.parseLong(tokens.get(i + 1));
                    long result = calculate(lhs, rhs, op);

                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i - 1, String.valueOf(result));
                    i-=2;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }



    public long solution(String expression) {
//        수식을 계산할 때는 스택 자료 구조를 이용하여 중위 표기법을 연산자 우선순위에 맞게 후위 표기법으로 변환 후 계산
//        숫자와 연산자수가 많지 않아 효율적이지는 않지만 쉽게 구현하는 방법으로 아래에서 풀이

        /**
         * 우선순위에 따라 연산자를 하나씩 처리하면서 전체 수식을 순회하며 연산자를 하나씩 계산
         *
         * 100 - 200 * 300 - 500 + 20이 expression으로 전달되었고, +, -, * 순이라면,
         * 수식을 전체 순회하며 +를 선행
         * 이후 결과에 대해 수식을 전체 순회하며 - 를 수행
         * 이후 결과에 대해 수식을 전체 순회하며 * 을 수행
         *
         * 전체 순회하기 위해, expression을 피연산자와 연산자를 대상으로 배열처리
         */


        //returnDelimiters 매개를 통해, 구분자 함께 토큰화
        StringTokenizer st = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (st.hasMoreTokens()) {
            tokens.add(st.nextToken());
        }

        long max = 0;
        for (String[] precedence : precedences) {
            long value = Math.abs(calculate(new ArrayList<>(tokens), precedence));
            if (max < value) {
                max = value;
            }
        }

        return max;
    }
}
