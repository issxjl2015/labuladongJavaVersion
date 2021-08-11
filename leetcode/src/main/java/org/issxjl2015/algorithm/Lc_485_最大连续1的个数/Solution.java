package org.issxjl2015.algorithm.Lc_485_最大连续1的个数;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/11/19:37
 * @Description:
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int left = 0, right = 0;
        while (left < nums.length && nums[left] == 0) {
            left++;
            right = left;
        }

        while (right < nums.length) {
            while (right < nums.length && nums[right] == 1) {
                right++;
                ans = Math.max(ans, right - left);
            }
            left = right;
            while (left < nums.length && nums[left] == 0) {
                left++;
            }
            right = left;
        }
        return ans;
    }
}
