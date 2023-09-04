package codingtest.tip;

public class LRU {
    public int[] solution(int s, int[] arr) {
        int[] cache = new int[s];
        for (int x : arr) {
            int i;
            // 같은 값이 있는지 찾는 반복문
            for (i = 0; i < s; i++) {
                // 같은 값이 있다면
                if (cache[i] == x) {
                    // 그 자리부터 앞에서 차례로 뒤로 밀어줌
                    while(i != 0){
                        cache[i] = cache[i-1];
                        i--;
                    }
                    // 제일 앞에 값 입력
                    cache[0] = x;
                    break;
                }
            }
            // 반복문을 끝까지 돌았을 때 제일 앞에 값을 입력해줌
            if(i == s){
                while(i != 1){
                    i--;
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }
}
