package codingtest;

public class ReverseLong {
    public int[] solution(long n) {
        char[] reverse = Long.toString(n).toCharArray();
        int[] answer = new int[reverse.length];

        for(int i = reverse.length-1; i>=0; i--){
            answer[answer.length-i-1] = Character.getNumericValue(reverse[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        new ReverseLong().solution(12345);
    }
}
