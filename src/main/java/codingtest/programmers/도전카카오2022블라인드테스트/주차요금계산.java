package codingtest.programmers.도전카카오2022블라인드테스트;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//92341
public class 주차요금계산 {
    private static class Fee {
        private final int baseTime;
        private final int baseFee;
        private final int unitTime;
        private final int unitFee;

        public Fee(int baseTime, int baseFee, int unitTime, int unitFee) {
            this.baseTime = baseTime;
            this.baseFee = baseFee;
            this.unitTime = unitTime;
            this.unitFee = unitFee;
        }

        public int cost(int time) {
            int fee = baseFee;
            time -= baseTime;
            while (time > 0) {
                fee += unitFee;
                time -= unitTime;
            }
            return fee;
        }
    }

    private int parseTime(String time) {
        String[] split = time.split(":");
        return Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
    }

    private static class Car {
        public final String number;
        private final Fee fee;
        private int inTime = -1;
        private int totalTime = 0;

        public Car(String number, Fee fee) {
            this.number = number;
            this.fee = fee;
        }

        public void in(int time) {
            this.inTime = time;
        }

        public void out(int time) {
            if (this.inTime == -1) return;
            totalTime += time - this.inTime;
            this.inTime = -1;
        }

        public int cost() {
            return fee.cost(totalTime);
        }
    }

    public int[] solution(int[] fees, String[] records) {
        Fee fee = new Fee(fees[0], fees[1], fees[2], fees[3]);

        Map<String, Car> cars = new HashMap<>();
        for (String record : records) {
            String[] tokens = record.split(" ");
            int time = parseTime(tokens[0]);
            String number = tokens[1];
            boolean isIn = tokens[2].equals("IN");

            if (!cars.containsKey(number)) {
                cars.put(number, new Car(number, fee));
            }

            Car car = cars.get(number);
            if (isIn) {
                car.in(time);
            }else{
                car.out(time);
            }
        }

        int endTime = parseTime("23:59");
        for (Car car : cars.values()) {
            car.out(endTime);
        }

        return cars.values().stream()
                .sorted(Comparator.comparing(car -> car.number))
                .mapToInt(Car::cost)
                .toArray();
    }
}

//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] fees, String[] records) {
//        int stdTime =fees[0];
//        int stdPay=fees[1];
//        int perTime=fees[2];
//        int perPay=fees[3];
//
//        Map<Integer,Integer> map = new HashMap<>();
//        Map<Integer,Integer> result = new TreeMap<>();
//
//        for(String record: records){
//            String[] rSplit =record.split(" ");
//            int time = getMin(rSplit[0]);
//            int carNumber= Integer.parseInt(rSplit[1]);
//            String state= rSplit[2];
//            if(state.equals("OUT")){
//                int start=map.get(carNumber);
//                int useTime= time-start;
//                if(result.containsKey(carNumber)){
//                    int a=result.get(carNumber);
//                    useTime+=a;
//                }
//                result.put(carNumber,useTime);
//                map.remove(carNumber);
//                continue;
//            }
//            map.put(carNumber,time);
//        }
//
//        for(int num :map.keySet()){
//            int start = map.getOrDefault(num,0);
//            int use_time=1439-start;
//
//            int total = result.getOrDefault(num,0);
//            result.put(num,total+use_time);
//        }
//
//        int[] answer = new int[result.size()];
//        int i=0;
//        for(int data: result.keySet()){
//            int time=result.get(data);
//
//            if(time<=stdTime){
//                time=stdPay;
//            }
//            else{
//                time=stdPay+(int)Math.ceil((double)(time-stdTime)/perTime)*perPay;
//            }
//            answer[i]=time;
//            i++;
//        }
//
//        return answer;
//    }
//
//    public int getMin(String time){
//        String[] temp= time.split(":");
//        return Integer.parseInt(temp[0])*60+Integer.parseInt(temp[1]);
//    }
//}