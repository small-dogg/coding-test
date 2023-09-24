package codingtest.programmers.book.이진탐색;

public class 예제 {

    private static int binarySearch(int[] arr, int target) {
        // 이진 탐색을 이용하여 정렬된 배열 arr 안에서 target의 인덱스 반환
        //(start,end]
        int start = 0;
        int end = arr.length;

        while (end > start) {
            int mid = (start+end) / 2;
            int value = arr[mid];

            if (value == target) {
                return mid;
            } else if (value > target) {
                //down
                mid = end;
            } else {
                //up
                start = mid+1;
            }
        }
        //target이 arr 안에 없다면 -1 반환
        return -1;
    }
}
