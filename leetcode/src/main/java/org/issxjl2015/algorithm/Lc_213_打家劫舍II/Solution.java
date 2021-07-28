package org.issxjl2015.algorithm.Lc_213_打家劫舍II;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/28/21:18
 * @Description: 打家劫舍 II
 */
public class Solution {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        if (len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        // 考虑最开始的房间
        int robValue1 = robMoney(nums, 0, len - 2);
        // 考虑不考虑最开始的房间
        int robValue2 = robMoney(nums, 1, len - 1);
        return Math.max(robValue1, robValue2);
    }

    private int robMoney(int[] nums, int start, int end) {
        int[] dp = new int[nums.length + 1];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);

        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}
