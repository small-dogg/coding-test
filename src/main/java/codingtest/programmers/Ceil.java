package codingtest.programmers;

public class Ceil {
    public int  solution(int X, int Y, int D) {
        // write your code in Java SE 8
        return (Y-X)/D;
    }

    public static void main(String[] args) {
        System.out.println(new Ceil().solution(10,85,30));
    }
}
