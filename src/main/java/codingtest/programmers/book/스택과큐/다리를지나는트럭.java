package codingtest.programmers.book.스택과큐;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    //현재 트럭이 올라갈 수있는 무게를 초과했는지 알아야함. + 최대 대수 이상 올라갔는지도 확인해야함.
    public int solution(int bridge_length, int weight, int[] truck_weights){
        int bridgeWeight = 0;
        Queue<Integer> bridge = new LinkedList<>();
        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        int time = 0;
        int truckIndex = 0; // 대기중인 트럭 인덱스

        while (truckIndex < truck_weights.length) {
            //트럭 처리
            bridgeWeight -= bridge.poll();
            int truckWeight = truck_weights[truckIndex];
            if(bridgeWeight+truckWeight <=weight){
                bridge.add(truckWeight);
                bridgeWeight += truckWeight;
                truckIndex++;
            }else{
                bridge.add(0);
            }
            time++;
        }

        while (bridgeWeight > 0) {
            bridgeWeight -= bridge.poll();
            time++;
        }

        return time;
    }

//    public int solution(int bridge_length, int weight, int[] truck_weights) {
//        int answer = 0;
//        Queue<Integer> q = new ConcurrentLinkedQueue<>();
//        int sum = 0;
//        for(int t : truck_weights) {
//            while(true) {
//                if(q.isEmpty()) {
//                    q.add(t);
//                    sum += t;
//                    answer++;
//                    break;
//                } else if(q.size() == bridge_length) {
//                    sum -= q.poll();
//                } else {
//                    if(sum + t > weight) {
//                        answer++;
//                        q.add(0);
//                    } else {
//                        q.add(t);
//                        sum+=t;
//                        answer++;
//                        break;
//                    }
//                }
//            }
//        }
//        return answer + bridge_length;
//    }
}
