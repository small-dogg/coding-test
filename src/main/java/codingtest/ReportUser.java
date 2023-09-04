package codingtest;

import java.util.*;

public class ReportUser {

    public static void main(String[] args) {
        new ReportUser().solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2);
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> user = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        //정보 초기화
        for (String s : id_list) {
            user.put(s,new HashSet<>());
            resultMap.put(s,0);
        }

        //대상 별 신고자 정보 입력
        for (String s : report) {
            String[] sArr = s.split(" ");
            String reporter = sArr[0];
            String target = sArr[1];

            user.get(target).add(reporter);
        }


        user.forEach((key,val)->{
            if(val.size()>=k){
                for (String s : val) {
                    resultMap.put(s,resultMap.get(s)+1);
                }
            }
        });

        int[] answer = {};
        return resultMap.values().stream().mapToInt(i -> i).toArray();
    }
}
