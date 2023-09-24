package codingtest.programmers;

public class Reverse3jinbub {
    public int solution(int n) {
        StringBuilder ans = new StringBuilder();
        while(n>0){
            ans.append(n % 3);
            n/=3;
        }
        return Integer.parseInt(ans.toString(),3);
    }

    public static void main(String[] args) {
        new Reverse3jinbub().solution(45);
    }
}
