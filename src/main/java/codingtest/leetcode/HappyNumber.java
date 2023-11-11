package codingtest.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        new HappyNumber().isHappy(7);
    }
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while(n != 1 && !s.contains(n)){
            s.add(n);

            int ans = 0;
            while(n != 0){
                int rem = n%10;
                ans += (rem*rem);
                n /= 10;
            }
            n=ans;
        }
        return n == 1;
    }
}
