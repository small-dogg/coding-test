package codingtest.programmers;

public class StringToJadenCase {
    public String solution(String s) {
        char[] cArr = s.toCharArray();
        int index = 0;
        for(int i=0;i<cArr.length;i++){
            if(cArr[i]==' '){
                index=0;
                continue;
            }
            if(index==0){
                cArr[i]=Character.toUpperCase(cArr[i]);
                index++;
            }else{
                cArr[i]=Character.toLowerCase(cArr[i]);
            }
        }
        System.out.println(String.valueOf(cArr));
        return String.valueOf(cArr);
    }

    public String solution2(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer.append(flag ? ss.toUpperCase() : ss);
            flag = ss.equals(" ");
        }

        return answer.toString();
    }
}
