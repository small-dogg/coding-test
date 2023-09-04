package codingtest;

import java.util.Objects;

public class LRUCache {
    public int solution(int cacheSize, String[] cities) {
        if(cacheSize==0){
            return cities.length*5;
        }
        String[] cache = new String[cacheSize];
        int time = 0;
        for (String x : cities) {
            x=x.toLowerCase();
            int i;
            // 같은 값이 있는지 찾는 반복문
            for (i = 0; i < cacheSize; i++) {
                // 같은 값이 있다면
                if (cache[i]!=null && cache[i].equals(x)) {
                    // 그 자리부터 앞에서 차례로 뒤로 밀어줌
                    while(i != 0){
                        cache[i] = cache[i-1];
                        i--;
                    }
                    // 제일 앞에 값 입력
                    cache[0] = x;
                    time+=1;
                    break;
                }
            }
            // 반복문을 끝까지 돌았을 때 제일 앞에 값을 입력해줌
            if(i == cacheSize){
                while(i != 1){
                    i--;
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
                time+=5;
            }
        }
        return time;
    }

    public static void main(String[] args) {
        System.out.println(new LRUCache().solution(0,new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
