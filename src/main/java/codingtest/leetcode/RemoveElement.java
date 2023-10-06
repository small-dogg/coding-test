package codingtest.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;

        int idx = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]!=val){
                nums[idx++] = nums[i];
            }
        }

        return idx;
    }
}
