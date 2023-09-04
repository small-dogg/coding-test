package codingtest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ParkingPrice {
    public int[] solution(int[] fees, String[] records) {
        int stdTime =fees[0];
        int stdPay=fees[1];
        int perTime=fees[2];
        int perPay=fees[3];

        // Key= 차량넘버 value= 입장시간
        Map<Integer,Integer> map = new HashMap<>();
        // Key= 차량넘버 value= 이용비
        Map<Integer,Integer> result = new TreeMap<>();
        // 주차기록 처리하기
        for(String record: records){
            String[] rSplit =record.split(" ");
            int time = getMin(rSplit[0]);
            int carNumber= Integer.parseInt(rSplit[1]);
            String state= rSplit[2];
            if(state.equals("OUT")){
                int start=map.get(carNumber);
                int useTime= time-start;
                if(result.containsKey(carNumber)){
                    int a=result.get(carNumber);
                    useTime+=a;
                }
                result.put(carNumber,useTime);
                map.remove(carNumber);
                continue;
            }
            map.put(carNumber,time);
        }

        for(int num :map.keySet()){
            int start = map.getOrDefault(num,0);
            int use_time=1439-start;

            int total = result.getOrDefault(num,0);
            result.put(num,total+use_time);
        }

        int[] answer = new int[result.size()];
        int i=0;
        for(int data: result.keySet()){
            int time=result.get(data);

            if(time<=stdTime){
                time=stdPay;
            }
            else{
                time=stdPay+(int)Math.ceil((double)(time-stdTime)/perTime)*perPay;
            }
            answer[i]=time;
            i++;
        }

        return answer;
    }

    public int getMin(String time){
        String[] temp= time.split(":");
        return Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);
    }
}
