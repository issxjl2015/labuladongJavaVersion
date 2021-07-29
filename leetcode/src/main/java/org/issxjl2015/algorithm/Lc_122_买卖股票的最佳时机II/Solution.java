package org.issxjl2015.algorithm.Lc_122_买卖股票的最佳时机II;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:32
 * @Description:
 */
public class Solution {

    public int maxProfit(int[] prices) {
        // dp[i][0]: 第 i 天，买入股票后，现金
        // dp[i][1]: 第 i 天，卖出股票后，现金
        int[][] dp = new int[prices.length][2];
        // 初始化
        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < prices.length; i++) {
            // 递推公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i]);
        }
        return dp[prices.length - 1][1];
    }

}
