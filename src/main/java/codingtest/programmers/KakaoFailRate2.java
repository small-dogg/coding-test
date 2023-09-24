package codingtest.programmers;

import java.util.ArrayList;
import java.util.Collections;

public class KakaoFailRate2 {
    public int[] solution(int N, int[] stages) {
        double[] stage = new double[N+1];      // 스테이지마다 머물러 있는 사용자수를 담을 배열
        int[] answer = new int[N];
        // stage배열에 머물러있는 사용자수를 담는다 , 인덱스값이 스테이지번호
        for(int i : stages){
            if(i == N+1){
                continue;
            }
            stage[i]++;
        }

        ArrayList<Double> fail = new ArrayList<Double>();

        //스테이지에 도달한 명수
        double num =stages.length;
        //다음 스테이지로 올라갈때 줄어드는 사용자수를 계산하기 위해 사용
        double tmp = 0;


        //실패율을 구한 후 다시 stage배열에 담고, fail 리스트에도 담아준다.
        for(int i=1; i<stage.length; i++){

            tmp = stage[i];
            // 도달한 사용자 수가 0 일때, 실패율도 0
            if(num == 0){

                stage[i]=0;

            }else{

                stage[i] = stage[i]/num;

                num = num - tmp;

            }

            fail.add(stage[i]);

        }


        //  fail 리스트를 내림차순으로 정렬해준다.
        Collections.sort(fail,Collections.reverseOrder());


        //정렬된 fail리스트 값과 stage값을 비교해서 같으면 stage의 인덱스번호(스테이지번호)를 가져옴으로써
        //실패율이 높은 순으로 answer배열에 넣어준다.
        for(int i=0; i<fail.size(); i++){

            for(int j=1; j<stage.length; j++){

                if(fail.get(i) == stage[j]){

                    answer[i] = j;

                    stage[j] = -1;

                    break;

                }

            }

        }

        return answer;
    }

    public static void main(String[] args) {
        new KakaoFailRate2().solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3});
        new KakaoFailRate2().solution(4, new int[] {4,4,4,4,4});
        new KakaoFailRate2().solution(4, new int[] {1,1,1,1,2});
        new KakaoFailRate2().solution(4, new int[] {3,2,5,4,2});
        new KakaoFailRate2().solution(7, new int[] {2, 1, 2, 6, 2, 4, 3, 3,7,5});
        new KakaoFailRate2().solution(5,  new int[] {});
    }
}
