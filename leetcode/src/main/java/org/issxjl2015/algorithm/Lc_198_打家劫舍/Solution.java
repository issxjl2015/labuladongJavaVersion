package org.issxjl2015.algorithm.Lc_198_打家劫舍;

public class Solution {

    public int rob(int[] nums) {
        // dp[i] 表示，到 i 号房屋的时候，
        int[] dp = new int[nums.length + 1];
        // 初始化
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            // 递推公式：到了第 i 房间，
            // 1、如果 i - 1 偷过了，那么 i 不能偷，最大值为 dp[i - 1]
            // 2、如果 i - 1 没偷，那么 i 可以偷，最大值为 dp[i - 2] + nums[i - 1]
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i - 1]);
        }

        return dp[nums.length];
    }

}
