package codingtest.tip;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRU2 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LRUSolution<String, String> clsTemp = LRUSolution.newInstance(cacheSize);
        for (int i = 0; i < cities.length; i++) {
            String sTemp = cities[i].toUpperCase();
            if (clsTemp.containsKey(sTemp)) {
                answer++;
            } else {
                answer += 5;
            }
            clsTemp.put(sTemp, sTemp);
        }

        return answer;
    }

    public static int solution2(int cacheSize, String[] cities) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<String>();

        if (cacheSize == 0)
            return cities.length * 5;

        for (int i = 0; i < cities.length; i++) {
            cities[i] = cities[i].toUpperCase();

            if (list.contains(cities[i])) {
                answer++;
                list.remove(cities[i]);
                list.add(cities[i]);
            } else {
                answer += 5;
                if (list.size() == cacheSize) {
                    list.remove(0);
                    list.add(cities[i]);
                }
                else
                    list.add(cities[i]);
            }
        }
        return answer;
    }
}

class LRUSolution<K, V> extends LinkedHashMap<K, V> {
    private int size;

    private LRUSolution(int size) {
        super(size, 0.75f, true);
        this.size = size;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > size;
    }

    public static <K, V> LRUSolution<K, V> newInstance(int size) {
        return new LRUSolution<K, V>(size);
    }
}
