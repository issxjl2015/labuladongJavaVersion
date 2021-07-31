package org.issxjl2015.algorithm.Lc_53_最大子序和;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/31/21:30
 * @Description:
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        // dp数组：dp[i] 为 下标为 i 之前的数组构成的最大子序和
        int[] dp = new int[nums.length];
        // 初始化
        dp[0] = nums[0];

        int ans = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
