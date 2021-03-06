package org.issxjl2015.chapter2.algo_3_最大子数组问题;

public class Lc_53_最大子序和 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        // 定义 dp 数组：以 nums[i] 为结尾的子数组的和
        int[] dp = new int[len];

        // base case
        dp[0] = nums[0];

        for (int i = 1; i < len; i++) {
            // 状态转移方程
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
        }

        int ans = nums[0];
        for (int i : dp) {
            ans = Math.max(ans, i);
        }
        return ans;
    }
}
