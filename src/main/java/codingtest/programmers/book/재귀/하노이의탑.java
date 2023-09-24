package codingtest.programmers.book.재귀;

/*하노이의 탑에서 재귀 관점은 원판 하나를 하나의 기둥에서 다른 기둥으로 옮기는 것을 반복한다는 점이다.*/

/**
 * 1. 상태
 * 문제 : 원판 N개를 기둥 1에서 기둥 3으로 옮기는 과정
 * 변수
 * - 옮기려는 원판 수 N 개
 * - 원판이 현재 위치한 기둥 from
 * - 원판이 이동해야하는 기둥 to
 * 따라서 하노이의 상태는 (n, from, to) 로 구성할 수 있다.
 * 원판 n개를 기둥 1에서 기둥 3으로 옮기는 과정은 (n, 1, 3)으로 표현할 수 있다.
 * 2. 종료 조건
 * 원판이 한개인 경우 (1, from, to)로 표현 -> [[from, to]]
 * 이말인즉슨, "원판 1개를 from 에서 to로 옮기는 문제"는 바로 'from 에서 tofh 원판을 옮기면 된다는' 의미가 된다.
 **/

/** 2. 종료 조건
 * 원판이 한개인 경우 (1, from, to)로 표현 -> [[from, to]]
 * 이말인즉슨, "원판 1개를 from 에서 to로 옮기는 문제"는 바로 'from 에서 tofh 원판을 옮기면 된다는' 의미가 된다.
 **/


import java.util.ArrayList;
import java.util.List;

/** 3. 점화식
 * 점화식을 찾기 힘들때는 가장 큰 상태와 종료 조건에서 찾은 가장 작은 상태를 이용하여 유추해볼 수 있다.
 * 앞서 (1, from, to)의 경우 n 변수가 1로 수렴하려면 n 값이 점점 줄어들어야한다는 것을 이해할 수 있다.
 *
 * 따라서, 상태 변수 n이 n-1로 전이되어야 한다고 가정하고 이를 기반으로 부분문제를 해결할 수 있는 점화식을 생각해보자.
 * 즉, (n, from, to) 를 (n-1, from, to) 부분문제로 풀수 있는지를 확인해보면 된다.
 *
 * **[가정] 원반 n개를 이동시키는 부분 문제는 원반 n-1개를 이동시키는 부분 문제로 해결할 수 있다. **
 *
 * (n, from, to)를 해결하는 첫번째 단계는 n-1개의 원판을 from이나 to가 아닌 빈 기둥으로 옮기는 것이다.
 * 기둥은 1, 2, 3으로 나타내므로 빈 기둥 empty는 다음과 같이 계산할 수 있다.
 * empty = 6 - from - to
 *
 * 1단계 : (n-1, from, empty)
 * 2단계 : (1, from, to)
 * 3단계 : (n-1, empty, to)
 *
 * 점화식 :
 *  (n, from, to) = (n-1, from, empty) + (1, from, to) + (n-1, empty, to)
 *  단, empty = 6 - from - to
 */
public class 하노이의탑 {

    public static void main(String[] args) {
        int[][] solution = new 하노이의탑().solution(4);
    }

    private void hanoi(int n, int from, int to, List<int[]> process) {
        //종료 조건(from 자리에 한개밖에 안남아서 to로 이동)
        if (n == 1){
            process.add(new int[]{from, to});
            return;
        }

        //점화식
        int empty = 6 - from - to;
        hanoi(n - 1, from, empty, process);
        hanoi(1, from, to, process);
        hanoi(n - 1, empty, to, process);
    }

    public int[][] solution(int n) {
        List<int[]> process = new ArrayList<>();
        hanoi(n, 1, 3, process);
        return process.toArray(new int[0][]);
    }
}
