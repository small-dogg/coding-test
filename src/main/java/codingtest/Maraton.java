package codingtest;

import java.util.HashMap;
import java.util.Map;

public class Maraton {
    public String solution(String[] participant, String[] completion) {
        StringBuffer sb = new StringBuffer();
        Map<String, Integer> participantMap = new HashMap<>();
        for (String s : participant) {
            participantMap.put(s,participantMap.getOrDefault(s,0)+1);
        }
        for (String s : completion) {
            participantMap.put(s,participantMap.getOrDefault(s,0)-1);
        }

        participantMap.forEach((k,v)->{
            if(v>0) sb.append(k);
        });

        return sb.toString();
    }

    public static void main(String[] args) {
        new Maraton().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"});
    }
}
