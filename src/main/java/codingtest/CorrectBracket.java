package codingtest;

public class CorrectBracket {
    boolean solution(String s) {
        boolean answer = true;
        int index = 0;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        for(int i=0;i<s.length();i++){
            if(index==0&&s.charAt(i)==(')')){
                return false;
            }

            if(s.charAt(i)==('(')){
                index++;
            }else{
                index--;
            }
        }
        if(index>0){
            return false;
        }
        return true;
    }
}
