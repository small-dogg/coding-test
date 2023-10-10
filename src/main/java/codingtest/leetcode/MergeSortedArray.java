package codingtest.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        new MergeSortedArray().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

//    O((m+n)log(m+n) -> sort 만큼 시간복잡도 증가.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i <nums2.length-1; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    //O(m+n)
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
