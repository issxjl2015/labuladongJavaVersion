package org.issxjl2015.tx.arrayandstring.lc_寻找两个正序数组的中位数;

import java.util.Arrays;

/**
 * 合并数组后，如果长度为奇数，则中位数为中间那个，如果是偶数，则中位数是中间两个数的均值
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < nums1.length) {
                nums[i] = nums1[i];
            } else {
                nums[i] = nums2[i - nums1.length];
            }
        }
        Arrays.sort(nums);
        double sum = 0;
        if (len % 2 == 0) {
            sum += 1.0 * (nums[len / 2] + nums[len / 2 -1]) / 2;
        } else {
            sum += nums[len / 2];
        }
        return sum;
    }
}
