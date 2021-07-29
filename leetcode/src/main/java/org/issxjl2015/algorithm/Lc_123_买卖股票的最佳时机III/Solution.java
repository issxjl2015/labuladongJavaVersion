package org.issxjl2015.algorithm.Lc_123_买卖股票的最佳时机III;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/29/23:46
 * @Description:
 */
public class Solution {

    public int maxProfit(int[] prices) {
        // dp[i][0]: 第 i 天，没有操作，现金
        // dp[i][1]: 第 i 天，第一次买入，现金
        // dp[i][2]: 第 i 天，第一次卖出，现金
        // dp[i][3]: 第 i 天，第二次买入，现金
        // dp[i][4]: 第 i 天，第二次卖出，现金
        int[][] dp = new int[prices.length][5];
        // 初始化
        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
            dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
            dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
        }

        return dp[prices.length - 1][4];
    }

}
