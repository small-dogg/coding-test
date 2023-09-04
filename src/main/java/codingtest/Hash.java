package codingtest;

import java.util.HashMap;

public class Hash {
    public int solution(int[] A) {
        HashMap<Integer, Integer> hashVal = new HashMap<>();

        for(Integer a:A){
            hashVal.put(a,hashVal.getOrDefault(a,0)+1);
        }

        for(Integer a:hashVal.keySet()){
            if(hashVal.get(a)%2!=0) return a;
        }
        return -1;
    }

    public static void main(String[] args) {
        new Hash().solution(new int[]{9, 3, 9, 3, 9, 7,11,11,4,4,3,2,3,2, 9});
    }
}
