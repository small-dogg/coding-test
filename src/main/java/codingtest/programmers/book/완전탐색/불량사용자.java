package codingtest.programmers.book.완전탐색;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 불량사용자 {

    public static void main(String[] args) {
        new 불량사용자().solution(new String[]{"fromdo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "abc1**"});
    }

    public int solution(String[] userId, String[] bannedId) {

        String[][] bans = Arrays.stream(bannedId)
                .map(banned -> banned.replace('*', '.'))
                .map(banned -> Arrays.stream(userId)
                        .filter(id -> id.matches(banned))
                        .toArray(String[]::new))
                .toArray(String[][]::new);

        Set<Set<String>> banSet = new HashSet<>();
        count(0, new HashSet<>(), bans, banSet);
        return banSet.size();


    }

    //상태 : (index, banned)
    //종료 조건 : 더이상 사용자 아이디를 선택할 수 업을 때
    private void count(int index, Set<String> banned, String[][] bans, Set<Set<String>> banSet) {
        if (index == bans.length) {
            banSet.add(new HashSet<>(banned));
            return;
        }

        for (String id : bans[index]) {
            if (banned.contains(id)) continue;
            banned.add(id);
            count(index+1, banned, bans, banSet);
            banned.remove(id);
        }
    }
}
