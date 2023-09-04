package codingtest;

public class OneTwoFour {
    public String solution(int n) {
        int[] num = {4,1,2};
        String answer = "";
        while(n>0){
            answer+=num[n%3];
            n/=3;
        }
        return answer;
    }
}
