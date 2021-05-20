package org.issxjl2015.algorithm.Lc_34_在排序数组中查找元素的第一个和最后一个位置;

/**
 * 二分搞定
 */
public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len < 1) {
            return new int[] {-1 , -1};
        }
        int left = 0, right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int tmp = nums[mid];
            if (tmp > target) {
                right--;
            } else if (tmp < target) {
                left++;
            } else {
                left = mid;
                right = mid;
                while (left >= 1 && nums[left] == nums[left - 1]) {
                    left--;
                }
                while (right < len - 1 && nums[right] == nums[right + 1]) {
                    right++;
                }
                return new int[] {left, right};
            }
        }

        return new int[] {-1, -1};
    }
}
