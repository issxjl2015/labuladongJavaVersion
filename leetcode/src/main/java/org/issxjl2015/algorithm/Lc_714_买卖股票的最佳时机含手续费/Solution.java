package org.issxjl2015.algorithm.Lc_714_买卖股票的最佳时机含手续费;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/21:36
 * @Description:
 */
public class Solution {

    public int maxProfit(int[] prices, int fee) {
        // dp[i][0]: 第 i 天，买入股票，现金
        // dp[i][1]: 第 i 天，卖出股票，付手续费后，现金
        int[][] dp = new int[prices.length][2];
        // 初始化
        dp[0][0] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            // 买入股票的递推公式
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            // 卖出股票的递推公式
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
        }
        // 这里为啥是dp[n - 1][0] 和 dp[n - 1][1] 取最大值呢？
        // 因为可能存在这样的情况，卖了股票，扣了手续费，反而亏了的情况
        return Math.max(dp[prices.length - 1][1], dp[prices.length - 1][0]);
    }

}
