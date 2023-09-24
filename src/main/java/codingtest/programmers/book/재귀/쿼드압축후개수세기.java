package codingtest.programmers.book.재귀;


//68936
public class 쿼드압축후개수세기 {

    private static class Count {
        public final int zero;
        public final int one;

        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }

        //Count 결과 더하기
        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }

    //재귀 메서드
    private Count count(int offsetX, int offsetY, int size, int[][] arr) {

        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    int h = size / 2;
                    /* 처음 비교 대상과 하나라도 다를 경우(정사각형 범위 내 서로 다른 값이 존재할 경우), 반환값 */
                    return count(offsetX, offsetY, h, arr)
                            .add(count(offsetX + h, offsetY, h, arr))
                            .add(count(offsetX, offsetY + h, h, arr))
                            .add(count(offsetX + h, offsetY + h, h, arr));
                }
            }
        }

        //모든 원소가 같은 값일 경우
        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }

    public int[] solution(int[][] arr) {
        //상태 : 정사각형의 범위를 나타내는 x, y, size가 필요 (offsetX, offsetY, size)
        //부분문제 : 상태가 나타내는 정사각형 범위를 압축하였을 때 남아있는 0의 개수와 1의 개수
        //종료 조건 : 범위 안 원소들이 모두 1이거나 0일경우 재귀가 종료

        Count count = count(0, 0, arr.length, arr);
        return new int[]{count.zero, count.one};
    }
}
