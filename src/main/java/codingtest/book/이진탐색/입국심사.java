package codingtest.book.이진탐색;

//n명의 임국심사 받을 사람
//심사원마다 걸리는 시간이 상이

//입국심사 대기인원 최대 10억
//한명 심사하는데 걸리는시간 최대 10억분
//심사관 최대 10만명

//범위 : (1분 ~ 100경) log2100경 = 약 60

//정답 검사 : 심사관 수가 M이라고하면 O(M) 소요

//시간복잡도 : 이진 탐색의 최대범위 N, 심사관 수 M = 이진탐색 반복회수 O(logN)과 매 반복마다 O(M)소요 -> O(M logN), 최대값 수행시 약 600만
public class 입국심사 {


    //해당 시간동안 모두 수행이 가능한지 확인
    // t : 주어진 시간, n : 심사 대기인원, times : 심사원의 수행가능 시간들
    private boolean isValid(long t, int n, int[] times) {
        //주어진 시간동안 처리 가능한 수
        long c = 0;
        for (int time : times) {
            c += t / time;
        }
        return c >= n;
    }

    public long solution(int n, int[] times) {
        long start = 0;
        long end = 1000000000000000000L;

        //조건을 만족하는 값 중 가장 작은 값, 범위표기 : [start, end]
        while (end > start) {
            long t = (start + end) / 2;

            // 정답 검사, 범위 좁히기
            if (isValid(t, n, times)) {
                end = t;
            } else {
                start = t + 1;
            }
        }

        return start;
    }

}
