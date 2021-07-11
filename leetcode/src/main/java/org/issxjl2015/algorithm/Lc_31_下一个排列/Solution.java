package org.issxjl2015.algorithm.Lc_31_下一个排列;

import java.util.Arrays;

public class Solution {

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int len = nums.length;
        for (int i = len - 1; i >= 1; i--) {
            // 找到非降序的 nums[i-1]
            if (nums[i] > nums[i - 1]) {
                // 对 下标为 i 以及后续的数字进行排序
                Arrays.sort(nums, i, len);
                // 找到第一个大于 nums[i-1] 的数字，交换彼此
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, j, i - 1);
                        return;
                    }
                }
            }
        }
        // 不存在下一个更大排列，则升序排列
        Arrays.sort(nums);
    }

    private void swap(int[] nums, int l, int r) {
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}
