package codingtest.programmers.book.정렬;

import java.util.*;

public class 메뉴리뉴얼2 {
    public static void main(String[] args) {
        new 메뉴리뉴얼2().solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4});
    }

    private static class RenewMenu {
        private final String menu;
        private final int count;

        public RenewMenu(String menu, int count) {
            this.menu = menu;
            this.count = count;
        }
    }

    //현재까지 만들어진 코스를 전개하여
    //해당 코스가 과거 주문 목록에 얼마나 호출되었는지 확인
    //주문 목록으로 생성가능한 조합 점화
    private void getCourses(String[] orders, List<Character> menus, int idx, String s, Map<Integer, List<RenewMenu>> renewal) {
        if (idx == menus.size()) return;

        if (renewal.containsKey(s.length())) {
            int maxCount = renewal.get(s.length()).get(0).count;
            int nowCount = 0;


            for (String order : orders) {

//                if (order.containAll(s)) {
//                    nowCount++;
//                }
            }

            if (nowCount > maxCount) {
                renewal.get(s.length()).clear();
                renewal.get(s.length()).add(new RenewMenu(s, nowCount));
            } else if (nowCount == maxCount) {
                renewal.get(s.length()).add(new RenewMenu(s, nowCount));
            }
        }

        for (int i = idx; i < menus.size(); i++) {
            getCourses(orders, menus, ++idx, s + menus.get(i), renewal);
        }
    }

    //과거 주문 목록을 기반으로, 신규 코스 요리를 반환
    public String[] solution(String[] orders, int[] course) {
        //전체 orders에 존재하는 모든 캐릭터를 추출
        Set<Character> menus = new HashSet<>();
        for (String order : orders) {
            for (char c : order.toCharArray()) menus.add(c);
        }

        List<Character> menuList = new ArrayList<>(menus);

        Map<Integer, List<RenewMenu>> renewal = new HashMap<>();
        for (int i : course) {
            List<RenewMenu> initMenu = new ArrayList<>();
            initMenu.add(new RenewMenu("", 0));
            renewal.put(i, initMenu);
        }

        getCourses(orders, menuList, 0, "", renewal);

        return new String[]{};
    }
}
