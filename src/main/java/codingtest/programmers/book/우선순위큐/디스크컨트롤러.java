package codingtest.programmers.book.우선순위큐;

import java.util.*;

public class 디스크컨트롤러 {
    private static class Job {
        public final int start;
        public final int duration;

        public Job(int start, int duration) {
            this.start = start;
            this.duration = duration;
        }
    }

    public int solution(int[][] rawJobs) {
        Job[] jobs = new Job[rawJobs.length];
        for (int i = 0; i < jobs.length; i++) {
            jobs[i] = new Job(rawJobs[i][0], rawJobs[i][1]);
        }

        // Job 실행 순서기준으로 오름차순 정렬
        Arrays.sort(jobs, Comparator.comparingInt(job -> job.start));

        Queue<Job> q = new LinkedList<>(Arrays.asList(jobs));

        //수행 가능 작업 중 수행시간이 가장 짧은 잡을 선택
        PriorityQueue<Job> pq = new PriorityQueue<>(Comparator.comparingInt(job -> job.duration));

        int exec = 0; //작업 요청 시간부터 종료시간까지 누접합
        int time = 0; //현재 시간

        //q : 현재 시간이 아직 작업의 요청시간에 도달하지 못한 작업들
        //pq : 이미 요청 시간은 지났지만 아직 시작하지 못한 작업들

        //각 큐가 비어질 때까지 작업을 처리
        while(!q.isEmpty() || !pq.isEmpty()){
            //가장 먼저 시작할 수 있는 작업을 고름(요청시간이 지난 작업들을 뽑아서 pq에 추가)
            while (!q.isEmpty() && q.peek().start <= time) {
                pq.add(q.poll());
            }

            //pq가 비어있을 경우, q에서 가장 우선순위가 높은 작업이 시작될때까지 대기
            if (pq.isEmpty()) {
                time = q.peek().start;
                continue;
            }

            Job job = pq.poll();
            exec += time + job.duration - job.start;
            time += job.duration;

        }

        return exec / jobs.length;
    }
}
