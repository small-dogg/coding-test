package codingtest.leetcode;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (char c : jewels.toCharArray()) {
            for (char c1 : stones.toCharArray()) {
                if(c==c1){
                    result++;
                }
            }
        }
        return result;
    }
}
