package codingtest.leetcode;

public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if(operation.contains("++")){
                result++;
            }else{
                result--;
            }
        }

        return result;
    }

    public int finalValueAfterOperations2(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;
    }
}
