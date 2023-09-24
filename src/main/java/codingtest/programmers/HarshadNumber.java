package codingtest.programmers;

public class HarshadNumber {
    public boolean solution(int x) {
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String str : arr) sum+=Integer.parseInt(str);
        return x%sum==0?true:false;
    }
}
