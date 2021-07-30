package org.issxjl2015.algorithm.Lc_300_最长递增子序列;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/22:13
 * @Description:
 */
public class Solution {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        // dp[i] 表示 [0...i] 的最长上升子序列
        int[] dp = new int[nums.length];
        // 初始化
        Arrays.fill(dp, 1);
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    ans = Math.max(dp[i], ans);
                }
            }

        }
        return ans;
    }

}
