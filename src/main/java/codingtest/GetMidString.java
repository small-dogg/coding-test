package codingtest;

public class GetMidString {
    public String solution(String s) {
        String[] sArr = s.split("");
        return sArr.length%2==0?sArr[sArr.length/2-1]+sArr[sArr.length/2]:sArr[sArr.length/2];
        //s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }
}
