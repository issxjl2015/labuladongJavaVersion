package org.issxjl2015.algorithm.Lc_188_买卖股票的最佳时机IV;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: issxjl2015
 * @Date: 2021/07/30/20:13
 * @Description:
 */
public class Solution {

    public int maxProfit(int k, int[] prices) {
        // 注意看条件： k 为 0 或者 prices.length 为 0 时，直接返回 0 即可
        if (k == 0 || prices.length == 0) {
            return 0;
        }
        // dp[i][0]: 第 i 天，不操作，现金
        // dp[i][1]: 第 i 天，第一次买入股票，现金
        // dp[i][2]: 第 i 天，第一次卖出股票，现金
        // dp[i][3]: 第 i 天，第二次买入股票，现金
        // dp[i][4]: 第 i 天，第二次卖出股票，现金
        // dp[i][j]: 第 i 天，第 (j + 1) / 2 次 j 为 奇数，为买入，j 为偶数，为卖出，现金
        int[][] dp = new int[prices.length][2 * k + 1];
        // 初始化
        for (int i = 1; i < 2 * k; i += 2) {
            dp[0][i] = -prices[0];
        }

        for (int i = 1; i < prices.length; i++) {
            // 初始条件为：j = 0，且 迭代语句为：j += 2，能保证 j 始终为 偶数
            for (int j = 0; j < 2 * k - 1; j += 2) {
                // 买入股票的递推公式
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);
                // 卖出股票的递推公式
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);
            }
        }
        return dp[prices.length - 1][2 * k];
    }

}
