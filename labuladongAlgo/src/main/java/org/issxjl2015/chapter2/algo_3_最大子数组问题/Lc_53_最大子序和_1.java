package org.issxjl2015.chapter2.algo_3_最大子数组问题;

public class Lc_53_最大子序和_1 {

    /**
     * 基于动态规划算法，进行状态压缩
     * @param nums nums
     * @return 返回最大子数组和
     */
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int len = nums.length;
        // 定义 dp 数组：以 nums[i] 为结尾的子数组的和
        int dp = nums[0];
        int ans = dp;
        for (int i = 1; i < len; i++) {
            // 状态转移方程
            dp = Math.max(dp + nums[i], nums[i]);
            // 每次更新dp，都需要更新 ans的值
            ans = Math.max(ans, dp);
        }

        return ans;
    }
}
