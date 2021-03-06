package org.issxjl2015.chapter2.algo_1_动态规划设计_最长递增子序列;

import java.util.Arrays;

public class Lc_300_最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] dp = new int[nums.length];
        // base case
        Arrays.fill(dp, 1);

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int ans = 0;
        // 需要重新遍历一遍数组才知道最大的长度
        for (int value : dp) {
            ans = Math.max(ans, value);
        }
        return ans;
    }
}
