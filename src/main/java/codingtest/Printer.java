package codingtest;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/42587
public class Printer {
    public int solution(int[] priorities, int location) {

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == queue.peek()) {
                    if (i == location) {
                        answer++;
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
        return -1;
    }

    public int solution2(int[] priorities, int location) {
        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;



        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        new Printer().solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
    }
}
