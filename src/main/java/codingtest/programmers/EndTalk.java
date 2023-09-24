package codingtest.programmers;

import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class EndTalk {
    public int[] solution(int n, String[] words) {
        Set<String> wordSet = new HashSet<>();
        String before = "";
        for(int i =0; i<words.length/n; i++){
            for(int j=0; j<n; j++){
                if(words.length>n*i+j){
                    String now = words[n*i+j];
                    if(wordSet.contains(now)){
                        return new int[]{j+1,i+1};
                    }
                    if(before.length()!=0&&before.charAt(before.length()-1)!=now.charAt(0)){
                        return new int[]{j+1,i+1};
                    }
                    if(now.length()==1){
                        return new int[]{j+1,i+1};
                    }

                    wordSet.add(now);
                    before = now;
                }
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] solution = new EndTalk().solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println(solution[0]+","+solution[1]);
    }
}
