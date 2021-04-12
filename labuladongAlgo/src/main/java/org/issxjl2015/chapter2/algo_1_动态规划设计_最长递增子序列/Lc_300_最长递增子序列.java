package org.issxjl2015.chapter2.algo_1_动态规划设计_最长递增子序列;

import java.util.Arrays;

public class Lc_300_最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }

        // dp 数组的定义: dp[i] 表示的是 nums[0...i] 中最长的递增子序列的长度
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    // 当nums[i] > nums[j]时，将dp[j]对应的最长递增子序列后面接上 nums[i],
                    // 与 dp[i]对应的最长子序列进行比较
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        // 需要重新遍历一遍数组才知道最大的长度
        for (int dpVal : dp) {
            ans = Math.max(ans, dpVal);
        }
        return ans;
    }
}
