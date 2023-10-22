package codingtest.programmers.도전카카오2022블라인드테스트;

import java.util.*;

//92334
class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> user = new HashMap<>();
        Map<String, Integer> resultMap = new LinkedHashMap<>();

        for (String s : id_list) {
            user.put(s,new HashSet<>());
            resultMap.put(s,0);
        }

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
