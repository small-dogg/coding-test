package codingtest.programmers.book.그리디알고리즘;

import java.util.Arrays;
import java.util.Comparator;

//42884
public class 단속카메라 {
    /**
     * 단속 카메라를 설치해야 할 지점을 잘 골라 최소한으로 설치해야함.
     * 입력받은 이동 경로가 최대한 많이 겹치는 부분에 단속 카메라를 설치
     */
    public int solution(int[][] routes) {
        //각 이동경로의 끝지점으로 정렬
        Arrays.sort(routes, Comparator.comparingInt(route -> route[1]));

        //단속 카메라 설치
        int last = Integer.MIN_VALUE;

        int count = 0;
        //설치를 위해 모든 이동 경로를 순회
        for (int[] route : routes) {
            //직전에 설치한 단속 카메라가 경로에 포함되어있으면 해당 경로는 이미 단속 카메라를 만났기 때문에 추가로 설치하지 않음
            if(last >= route[0] && last <= route[1])continue;

            //단속 카메라를 만나지 못한 이동 경로일 경우, 이동 경로의 끝지점에 단속카메라를 설치
            last = route[1];
            count++;
        }

        return count;
    }
}
