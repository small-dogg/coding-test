package codingtest.book.문자열;

public class 문자열내p와y의개수 {
    public boolean solution(String s) {
        int ps = 0;
        int ys = 0;

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if(c=='p'||c=='P'){
                ps++;
            }
            if(c=='y'||c=='Y'){
                ys++;
            }
        }

        return ps==ys;
    }
}
