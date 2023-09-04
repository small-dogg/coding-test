package codingtest;

public class LCMwithNNum {
    public int solution(int[] arr) {
        int a = arr[0];
        for(int i=1; i<arr.length; i++){
            a = lcm(a,arr[i]);
        }
        return a;
    }
    static int gcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
