package codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result =  new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;

    }
}
