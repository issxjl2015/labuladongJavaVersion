package org.issxjl2015.tx.dynamicprogram.lc_最大子序和;

public class Solution {

    // dp 数组的迭代解法

    /**
     * dp 数组的迭代解法
     *  执行用时：击败了 93.97%
     *  内存消耗：击败了 44.68%
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        // dp 数组 表示 连续子数组的最大值
        int[] dp = new int[nums.length];
        // base case
        dp[0] = nums[0];

        int ans = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    /**
     * 压缩状态
     *  执行用时：击败了 100.00%
     *  内存消耗：击败了 69.68%
     * @param nums
     * @return
     */
    public int maxSubArray1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        // dp 数组 表示 连续子数组的最大值
        int before = nums[0];

        int ans = before;
        for (int i = 1; i < nums.length; i++) {
            int tmp = Math.max(before + nums[i], nums[i]);
            before = tmp;
            ans = Math.max(ans, tmp);
        }
        return ans;
    }

}
