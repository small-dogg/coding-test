package codingtest.programmers;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985/solution_groups?language=java
public class ExpectedDraw {
    public int solution(int n, int a, int b){
        int answer = 0;
        do {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;
            answer++;
        } while (a != b);
        return answer;
    }

    public int solution2(int n, int a, int b)
    {
        return Integer.toBinaryString((a-1)^(b-1)).length();
    }

    public static void main(String[] args) {
        new ExpectedDraw().solution(8, 4, 3);
    }
}
