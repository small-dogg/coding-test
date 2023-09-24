package codingtest.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/17684

public class Compression {
    public int[] solution(String msg) {

        List<Integer> compress = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        char ch = 'A';
        for (int i = 1; i < 27; i++) {
            map.put(ch + "", i);
            ch++;
        }

        int idx = 27;
        boolean isLast = false;

        for(int i = 0 ; i < msg.length() ; ++i) {
            String word = msg.charAt(i) + "";

            while(map.containsKey(word)){
                i++;
                if(i == msg.length()) {
                    isLast = true;
                    break;
                }
                word += msg.charAt(i);
            }

            if(isLast) {
                compress.add(map.get(word));
                break;
            }

            compress.add(map.get(word.substring(0, word.length() - 1)));
            map.put(word, idx++);

            i--;
        }

        int[] answer = new int[compress.size()];
        for(int i = 0 ; i < answer.length ; ++i){
            answer[i] = compress.get(i);
        }

        return answer;
    }
}
