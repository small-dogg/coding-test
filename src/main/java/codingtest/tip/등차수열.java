package codingtest.tip;

public class 등차수열 {
    //r(n(n+1))/2
    public static void main(String[] args) {
        System.out.println(sumArithmeticSequence(3, 10));

    }
    public static long sumArithmeticSequence(int start, int count){
        return (long) count * (count+1) / 2 * start;
    }
}
