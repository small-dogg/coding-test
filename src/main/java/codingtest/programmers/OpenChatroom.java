package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

public class OpenChatroom {
    private final String enter = "님이 들어왔습니다.";
    private final String leave = "님이 나갔습니다.";

    public static void main(String[] args) {
        new OpenChatroom().solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"});
    }

    public String[] solution(String[] record) {
        String[] answer = {};

        List<String> objects = new ArrayList<>();

        for (String s : record) {
            String[] s1 = s.split(" ");
            switch (s1[0]) {
                case "Enter":
                    objects.add(s1[1] + enter);
                    break;
                case "Leave":
                    objects.add(s1[1] + leave);
                    break;
                default:
                    for (int i = 0; i < objects.size(); i++) {
                        objects.set(i,
                                objects.get(i).replace(s1[1], s1[2]));
                    }
            }
        }
        return objects.toArray(new String[0]);
    }
}
