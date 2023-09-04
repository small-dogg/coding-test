package codingtest;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FailedRate {
    public int[] solution(int N, int[] stages) {
//      실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        //전체 스테이지의 개수 N
        //게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages
        int[] answer = {};
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int stage : stages) {

            integerMap.put(stage, integerMap.getOrDefault(stage, 0));
        }
        LinkedList<Map.Entry<Integer, Integer>> entries = new LinkedList<>(integerMap.entrySet());
        entries.sort(Map.Entry.comparingByValue());


        int[] result = new int[entries.size()];
        for (int i = 0; i < entries.size(); i++) {
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}
