package codingtest;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int lt=0;
        int rt=people.length-1;
        while(lt<=rt) {
            int sum = people[lt]+people[rt];
            if(lt!=rt-- && sum<=limit) {
                lt++;
            }
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        new LifeBoat().solution(new int[]{70, 80, 50,50},100);
    }
}
