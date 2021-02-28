package org.issxjl2015.tx.arrayandstring.lc_合并两个有序数组;

import java.util.Arrays;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // 解法一：
        System.arraycopy(nums2, 0, nums1, m, nums2.length);
        Arrays.sort(nums1);
    }
}
