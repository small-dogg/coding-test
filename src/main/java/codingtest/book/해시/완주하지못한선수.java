package codingtest.book.해시;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();

        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            participantMap.put(s, participantMap.get(s) - 1);
        }

        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) == 1) {
                return s;
            }
        }
        return null;
    }
}
