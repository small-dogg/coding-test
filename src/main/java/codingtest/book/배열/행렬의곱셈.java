package codingtest.book.배열;

public class 행렬의곱셈 {

    public static void main(String[] args) {
        행렬의곱셈 행렬의곱셈 = new 행렬의곱셈();

        int[][] arr1 = new int[][]{
                {1, 4},
                {3, 2},
                {4, 1}};
        int[][] arr2 = new int[][]{
                {3, 3},
                {3, 3}};

        행렬의곱셈.solution(arr1, arr2);
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {

        //좌측 행렬의 행의수와 우측 행렬의 열의수로 행렬의 곱 결과가 나옴
        int[][] arr = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //반환할 결고값의 모든 원소자리를 순회하며 해당 자리에 행렬의 곱해진 원소값을 입력
                arr[i][j] = 0;
                //arr1의 행과 arr2의 열을 순회하며 서로 곱한 값을 더함.
                for (int k = 0; k < arr1[i].length; k++) {
                    arr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return arr;
    }
}
