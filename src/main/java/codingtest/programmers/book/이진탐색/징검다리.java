package codingtest.programmers.book.이진탐색;
import java.util.Arrays;

// |-------ㅇ------ㅇ-----ㅇ-----ㅇ------|

// O : 도착 지점까지의 거리 최대 10억
// M : 바위 최대 5만개
// n : 제거할 바위 개수

// -> 단순 시뮬레이션 : O(M MCN)
// ------
// 특정 거리 d 에 대해 모든 지점 사이의 거리가 d 이상이 되도록 바위를 없앨 수 있는지 검사
// -> 바위 n개를 이용하여 특정거리 d에 대해 모든 지점 사이의 거리가 d 이상이 되는 d 중 가장 큰 값

// 1. 바위 위치를 앞에서부터 순서대로 순회
// 2. 인접한 바위 사이의 거리를 구하면서 거리가 d보다 작으면 바위를 하나 없앰
// 3. 모두 반복했을 때 없앤 바위 개수가 n보다 같거나 작으면 d는 조건을 만족

// 주어진 거리범위만큼 이진 탐색 수행시 O(log D) 소요
// 주어진 바위개수 M일 경우 매반복마다 순회에 O(M) 소요
// 정렬에 O(M logM) 소요


// 정렬비용 + (거리 이진탐색 x 바위 개수 순회)
// O(M logM) + O(logD) x O(M) -> O(M(logM + logD))
// M= 50,000, D = 1,000,000,000 일 경우 시작복잡도 2,275,000
public class 징검다리 {

    //distance : 도착지점까지의 거리
    //rocks : 바위 사이간 거리
    //n : 제거할 바위 수

    private boolean isValid(int d, int[] rocks, int n) {
        int removed = 0; // 제거한 바위 개수
        int last = 0; // 마지막 바위 위치
        for (int rock : rocks) {
            //
            if (rock - last < d) {
                removed++;
                continue;
            }
            last = rock;
        }
        return removed <= n;
    }


    public int solution(int distance, int[] rocks, int n) {

        //마지막돌에서 목적지까지의 거리만큼 추가 생성
        rocks = Arrays.copyOf(rocks, rocks.length + 1);
        rocks[rocks.length - 1] = distance;
        Arrays.sort(rocks);

//        [start,end)
            int start = 1;
            int end = distance +1;
        while (end - start > 1) {
            int d = (start + end) / 2;




            if (isValid(d, rocks, n)) {
                start = d;
            } else {
                end = d;
            }
        }

        return start;
    }
}
