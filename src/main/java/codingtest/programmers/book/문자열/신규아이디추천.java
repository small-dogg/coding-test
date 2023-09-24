package codingtest.programmers.book.문자열;

public class 신규아이디추천 {
    public String solution(String id) {

        //1단계
        String newId = id.toLowerCase();

        //2단계
        newId = newId.replaceAll("[^a-z0-9\\-_.]","");

        //3단계
        newId = newId.replaceAll("\\.+", ".");

        //4단계
        newId = newId.replaceAll("^\\.+|\\.+$","");

        //5단계
        if(newId.isEmpty()) newId = "a";

        //6단계
        if(newId.length()>=16) {
            newId = newId.substring(0, 15);
            newId = newId.replaceAll("\\.+$","");
        }

        while (newId.length() < 3) {
            newId += newId.charAt(newId.length() - 1);
        }

        return newId;
    }
}
