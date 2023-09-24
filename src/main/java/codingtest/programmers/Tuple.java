package codingtest.programmers;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tuple {
    public int[] solution(String s) {
        Map<Integer,Integer> mapteger = new LinkedHashMap<>();

        s=s.substring(2,s.length()-2);
        s = s.replaceAll("\\},\\{",",");
        String[] strArr = s.split(",");
        for(String str : strArr){
            Integer key = Integer.parseInt(str);
            mapteger.put(key,mapteger.getOrDefault(key,0)+1);
        }

        List<Map.Entry<Integer, Integer> > list = new ArrayList<>(mapteger.entrySet());
        Collections.sort(
                list,
                (entry1, entry2) -> entry2.getValue()-entry1.getValue());

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i]=list.get(i).getKey();
        }

        return answer;
    }

    public int[] solution3(String s) {

        Map<String, Integer> map = new HashMap<>();
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            String n = matcher.group();
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int size = map.size();
        int[] answer = new int[size];
        for (String key: map.keySet()) {
            answer[size - map.get(key)] = Integer.parseInt(key);
        }
        return answer;
    }

    public int[] solution2(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }



    public static void main(String[] args) {
        int[] solution = new Tuple().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}");
        System.out.println(solution);
    }
}
