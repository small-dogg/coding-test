package codingtest;

public class CaesarCipher {
    public String solution(String s, int n) {
        String answer = "";
        char[] cArr = s.toCharArray();
        for(char c:cArr){
            if(c==' '){
                answer+=" ";
                continue;
            }
            char data = (char)(c+n);
            if(Character.isUpperCase(c)){
                if(data > 'Z'){
                    answer += (char)(data-26);
                    continue;
                }
                answer +=data;
            }else{
                if(data > 'z'){
                    answer += (char)(data-26);
                    continue;
                }
                answer +=data;
            }
        }
        return answer;
    }
}
