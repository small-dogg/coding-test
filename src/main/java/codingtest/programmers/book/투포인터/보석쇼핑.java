package codingtest.programmers.book.투포인터;

import java.util.*;

//67258
public class 보석쇼핑 {
    public static void main(String[] args) {

    }

    public int[] solution(String[] gems) {
        int start = 0;
        int end = gems.length - 1;
        Set<String> gemSet = new HashSet<>(List.of(gems));

        int s = 0;
        int e = s;
        Map<String, Integer> includes = new HashMap<>();
        includes.put(gems[s], 1);

        while (s < gems.length) {
            //[s,e] 구간 검사
            if (includes.keySet().size() == gemSet.size()) {
                //모든 보석을 포함
                if (e - s < end - start) {
                    start = s;
                    end = e;
                }
                //시작점을 뒤로 이동시켜 더 작은 구간을 검사.
                //구간의 시작점에 있던 보석을 제거하고 시작점을 뒤로 이동시킴
                includes.put(gems[s], includes.get(gems[s]) - 1);
                if (includes.get(gems[s]) == 0) {
                    includes.remove(gems[s]);
                }
                s++;
            }

            //구간내 모든 보석이 포함되어있지 않다면 끝점을 뒤로 이동시켜 구간을 늘림(끝점이 배열범위를 넘어서면 안됨)
            else if (e < gems.length - 1) {
                e++;
                includes.put(gems[e], includes.getOrDefault(gems[e], 0) + 1);
            } else {
                break;
            }
        }

        return new int[]{start + 1, end + 1};
    }
}
