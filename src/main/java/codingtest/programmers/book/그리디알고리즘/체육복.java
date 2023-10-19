package codingtest.programmers.book.그리디알고리즘;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

//42862
public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        //여벌이 있지만, 도난받은 학생 구하기(retainAll() : 교집합)

        Set<Integer> owns = Arrays.stream(lost)
                .boxed()
                .collect(Collectors.toSet());
        owns.retainAll(Arrays.stream(reserve)
                .boxed()
                .collect(Collectors.toSet()));

        //체육복을 빌려야하는 학생을 차례로 확인하기 위해 queue 추가
        Queue<Integer> q = new LinkedList<>();
        for (int i : lost) q.add(i);

        //reserve를 순회하면서 큐에 담긴 체육복을 빌려야 하는 학생 중 몇명에게 빌려줄 수 있는지 카운트
        int get = 0;
        for (int i : reserve) {
            if(owns.contains(i)) continue; //도난당했으면 스킵
            while(!q.isEmpty() && (q.peek() < i-1 || owns.contains(q.peek()))){
                q.poll();
            }
            //빌려줄 수 있는 체육복이 없다면 종료
            if (q.isEmpty()) break;

            if (q.peek() <= i + 1) {
                q.poll();
                get++;
            }
        }

        return n - lost.length + owns.size() + get;
    }
}

//완전탐색 풀이 방법
class Solution2 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer =  n - lost.length;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당한 학생에게 체육복 빌려주는 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}