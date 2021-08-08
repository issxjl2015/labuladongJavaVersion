package org.issxjl2015.contest.biweeklycontest.biweeklycontest58;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/08/08/15:59
 * @Description:
 */
public class Lc_5828_K次调整数组大小浪费的最小总空间 {
    public int minSpaceWastedKResizing(int[] nums, int k) {
        int n = nums.length;
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int j = i; j < n; j++) {
                max = Math.max(max, nums[j]);
                sum += nums[j];
                // 计算差值
                g[i][j] = max * (j - i + 1) - sum;
            }
        }
        int[][] dp = new int[n][k + 2];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }

        for (int i = 0; i < n; i++) { // 前i个数
            for (int j = 1; j <= k + 1; j++) { // 调整j-1次
                for (int l = 0; l <= i; l++) {  // 最后一段nums[l...i]
                    // dp[-1][0] = 0, dp[-1][x] = inf
                    dp[i][j] = Math.min(dp[i][j], (l == 0 && l == 0 ? 0 : dp[l - 1][j - 1]) + g[l][i]);
                }
            }
        }
        return dp[n - 1][k + 1];
    }
}
