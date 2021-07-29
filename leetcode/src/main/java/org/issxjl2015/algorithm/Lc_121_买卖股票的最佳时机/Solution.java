package org.issxjl2015.algorithm.Lc_121_买卖股票的最佳时机;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:10
 * @Description:
 */
public class Solution {

    public int maxProfit(int[] prices) {
        // dp[i][0]: 第 i 天，买了股票后，最多的现金
        // dp[i][1]: 第 i 天，卖了股票后，最多的现金
        int[][] dp = new int[prices.length][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], -prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], prices[i] + dp[i - 1][0]);
        }
        return dp[prices.length - 1][1];
    }

}
