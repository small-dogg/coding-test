package codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
    public static void main(String[] args) {
        new PascalTriangle2().getRow(3);
    }
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0) return List.of(1);
        if(rowIndex==1) return List.of(1,1);

        return getRow(List.of(1, 1), rowIndex, 1);

    }

    public List<Integer> getRow(List<Integer> before, int rowIndex, int now) {
        if(now!=1) before.add(1);
        if(rowIndex == now){
            return before;
        }
        List<Integer> nowList = new ArrayList<>();
        nowList.add(1);
        for (int i = 1; i < before.size(); i++) {
            nowList.add(before.get(i - 1) + before.get(i));
        }
        return getRow(nowList, rowIndex, ++now);
    }
}
