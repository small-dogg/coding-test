package codingtest;

public class CollatzConjecture {
    public int solution(int num) {
        int answer = 0;

        return recursive(num,0);
    }

    public int recursive(int num, int cnt){
        if(num==1){
            return cnt;
        }
        if(num%2==0){
            num/=2;
            recursive(num,cnt++);
        }else{
            num=num*3+1;
            recursive(num,cnt++);
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(new CollatzConjecture().solution(8));
    }
}
