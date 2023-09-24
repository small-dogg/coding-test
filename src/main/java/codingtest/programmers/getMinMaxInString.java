package codingtest.programmers;

public class getMinMaxInString {
    public String solution(String s) {
        String[] sArr = s.split(" ");
        int max = Integer.parseInt(sArr[0]);
        int min = Integer.parseInt(sArr[0]);
        for(String str : sArr){
            int num = Integer.parseInt(str);
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        return min +" "+ max;
    }
}
