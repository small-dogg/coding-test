package codingtest.programmers;

import java.util.ArrayList;
import java.util.List;

public class XmultipleCountN {
    public long[] solution(int x, int n) {
        List<Long> integers = new ArrayList<>();
        long a=0;
        while(n>0){
            n--;
            integers.add(a+=x);
        }
        return integers.stream().mapToLong(i->i).toArray();
    }
}
