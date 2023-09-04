package codingtest;


import java.util.ArrayList;
import java.util.List;

public class FeatureDev {
    public int[] solution(int[] progresses, int[] speeds) {
        //progress 현재까지의 각 업무 진행율
        //speed progress별 일일 업무 진행속도
        //남은요일 = (100-progress[i])/speed
        //(100-progress[i])%speed!=0 남은요일 +1

        int[] lefts = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            int left = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i]>0) left += 1;
            lefts[i] = left;
        }

        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i <lefts.length; i++) {
            int tmp  = 1;
            if(lefts[i]==-1) continue;

            for (int j = i+1; j < lefts.length; j++) {
                if(lefts[j]==-1) continue;
                if(lefts[j]<=lefts[i]){
                    tmp++;
                    lefts[j]=-1;
                }else{
                    break;
                }
            }
            integers.add(tmp);
        }
        return integers.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] solution = new FeatureDev().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        for (int i : solution) {
            System.out.println(i);
        }
    }
}
