package codingtest.programmers;

public class DivisorSum {
    public int solution(int n) {
        int answer = 0;
        for(int i=0;i<n/2;i++){
            if(n%i==0){
                answer+=i;
            }
        }

        return answer+n;
    }
}
