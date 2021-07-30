package org.issxjl2015.algorithm.Lc_674_最长连续递增序列;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/22:31
 * @Description:
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        // dp[i] 表示 [0...i] 的最长连续递增序列
        int[] dp = new int[nums.length];
        // 初始化为 1
        Arrays.fill(dp, 1);
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}
