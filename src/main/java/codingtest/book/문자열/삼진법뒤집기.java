package codingtest.book.문자열;

public class 삼진법뒤집기 {
    public static void main(String[] args) {
        System.out.println(new 삼진법뒤집기().solution(45));;
    }

    public int solution(int n) {
        //3진법으로 변환
        String s = Integer.toString(n, 3);

        //3진법 뒤집기
        String reverse = new StringBuilder(s).reverse().toString();

        //뒤집어진 3진수 10진수로 반환
        return Integer.valueOf(reverse, 3);

        //Auto-(Un)Boxing 차이
//        return Integer.parseInt(reverse, 3);
    }
}
